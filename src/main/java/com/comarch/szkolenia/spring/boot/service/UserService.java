package com.comarch.szkolenia.spring.boot.service;

import com.comarch.szkolenia.spring.boot.model.User;
import com.comarch.szkolenia.spring.boot.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    @Override
    public List<User> getAll() {
        return this.userRepository.getAll();
    }

    @Override
    public Optional<User> getById(int id) {
        return this.userRepository.getById(id);
    }

    public SomeComponent createSomeComponent() {
        return new SomeComponent();
    }
}
