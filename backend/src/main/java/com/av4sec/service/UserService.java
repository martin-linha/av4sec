package com.av4sec.service;

import com.av4sec.persistance.document.User;
import org.springframework.stereotype.Service;

/**
 * Created by martinlinha on 01.04.17.
 */
public interface UserService extends CrudService<User, String> {

  Iterable<User> findAllOrderByCreatedOn();

}
