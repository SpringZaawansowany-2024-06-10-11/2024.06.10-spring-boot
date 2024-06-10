package com.comarch.szkolenia.spring.boot.service;

import com.comarch.szkolenia.spring.boot.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getAll();
    Optional<User> getById(int id);
    SomeComponent createSomeComponent();
}
