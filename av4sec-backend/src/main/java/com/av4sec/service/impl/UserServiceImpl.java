package com.av4sec.service.impl;

import com.av4sec.persistance.dao.UserDao;
import com.av4sec.persistance.document.User;
import com.av4sec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by martinlinha on 01.04.17.
 */
@Service
public class UserServiceImpl extends CrudServiceImpl<User, String> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    CrudRepository<User, String> getRepository() {
        return userDao;
    }
}
