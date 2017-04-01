package com.av4sec.persistance.dao;

import com.av4sec.persistance.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by martinlinha on 01.04.17.
 */
public interface UserDao extends MongoRepository<User, String> {

  Iterable<User> findAllByOrderByCreatedOnDesc();
}

