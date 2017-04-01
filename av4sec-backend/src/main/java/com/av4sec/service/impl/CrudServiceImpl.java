package com.av4sec.service.impl;

import com.av4sec.service.CrudService;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by martinlinha on 01.04.17.
 */
public abstract class CrudServiceImpl<T, U extends Serializable> implements CrudService<T, U> {

    @Override
    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T save(T t) {
        return getRepository().save(t);
    }

    @Override
    public T findById(U u) {
        return getRepository().findOne(u);
    }

    abstract CrudRepository<T, U> getRepository();
}
