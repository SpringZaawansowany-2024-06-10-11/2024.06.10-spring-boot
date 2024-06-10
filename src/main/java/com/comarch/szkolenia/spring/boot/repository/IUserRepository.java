package com.comarch.szkolenia.spring.boot.repository;

import com.comarch.szkolenia.spring.boot.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {
    List<User> getAll();
    Optional<User> getById(int id);
}
