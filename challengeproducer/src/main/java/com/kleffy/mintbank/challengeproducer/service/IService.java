package com.kleffy.mintbank.challengeproducer.service;

public interface IService<T, ID> {
    T create(T d);

    T update(T t);

    T read(ID id);

    boolean delete(ID id);
}
