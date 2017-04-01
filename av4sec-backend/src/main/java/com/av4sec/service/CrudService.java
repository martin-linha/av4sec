package com.av4sec.service;

import java.io.Serializable;

/**
 * Created by martinlinha on 01.04.17.
 */
public interface CrudService<T, U extends Serializable> {
    Iterable<T> findAll();

    T save(T t);

    T findById(U u);
}
