package com.av4sec.rest;

import com.av4sec.persistance.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by martinlinha on 01.04.17.
 */
@RestController("/user")
public class UserRestService {

    @GetMapping
    private Iterable<User> getUsers() {
        User user = new User();
        user.setFirstname("Martin");
        user.setLastname("Linha");
        return Arrays.asList(user);
    }
}
