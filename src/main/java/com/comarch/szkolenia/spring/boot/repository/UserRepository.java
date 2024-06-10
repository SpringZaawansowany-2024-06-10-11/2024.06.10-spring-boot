package com.comarch.szkolenia.spring.boot.repository;

import com.comarch.szkolenia.spring.boot.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class UserRepository implements IUserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        this.users.add(new User(1, "Janusz", "Kowalski"));
        this.users.add(new User(2, "Zbyszek", "Malinowski"));
        this.users.add(new User(3, "Wiesiek", "Jakis"));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public Optional<User> getById(final int id) {
        return this.users.stream().filter(u -> u.getId() == id).findFirst();
    }
}
