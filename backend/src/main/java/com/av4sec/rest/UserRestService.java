package com.av4sec.rest;

import com.av4sec.persistance.dao.UserDao;
import com.av4sec.persistance.document.User;
import com.av4sec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Created by martinlinha on 01.04.17.
 */
@RestController
@RequestMapping("/users")
public class UserRestService {

  enum UserOrder {
    CREATED_ON("createdOn");
    String order;

    private UserOrder(String order) {
      this.order = order;
    }
  }

  @Autowired
  private UserService userService;

  @GetMapping
  private Iterable<User> getUsers(@RequestParam(required = false) String order) {
    if (order == null) {
      return userService.findAll();
    }
    if (UserOrder.CREATED_ON.order.equals(order)) {
      return userService.findAllOrderByCreatedOn();
    }
    throw new IllegalArgumentException("Unsupported order " + order);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  private void addUser(@RequestBody User user) {
    userService.save(user);
  }
}
