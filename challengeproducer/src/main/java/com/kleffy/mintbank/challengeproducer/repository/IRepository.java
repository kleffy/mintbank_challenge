package com.kleffy.mintbank.challengeproducer.repository;

public interface IRepository<T, ID> {
    T create(T d);
    T update(T t);
    T read(ID id);
    boolean delete(ID id);
}
