package com.av4sec.rest;

import com.av4sec.persistance.dao.UserDao;
import com.av4sec.persistance.document.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by martinlinha on 01.04.17.
 */
@RestController("/user")
public class UserRestService {

    @Autowired
    private UserDao userDao;

    @GetMapping
    private Iterable<User> getUsers() {
        return userDao.findAll();
    }
}
