package com.comarch.szkolenia.spring.boot.controllers;

import com.comarch.szkolenia.spring.boot.library.X;
import com.comarch.szkolenia.spring.boot.model.User;
import com.comarch.szkolenia.spring.boot.service.IUserService;
import com.comarch.szkolenia.spring.boot.service.SomeComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class SimpleController {

    private final IUserService userService;
    private final X x;
//    private final SomeComponent someComponent;

    /*public SimpleController(IUserService userService) {
        this.someComponent = userService.createSomeComponent();
    }*/

    @GetMapping("/test1")
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/test2/{id}")
    public User getById(@PathVariable("id") int id) {
        this.x.cos();
        Optional<User> userBox = this.userService.getById(id);
        return userBox.orElseGet(() -> new User(0, "default", "default"));
    }
}
