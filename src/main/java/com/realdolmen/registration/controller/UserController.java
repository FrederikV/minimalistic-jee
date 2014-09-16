package com.realdolmen.registration.controller;

import com.realdolmen.registration.domain.User;
import com.realdolmen.registration.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@Named
@RequestScoped
public class UserController {
    @Inject
    private UserRepository userRepository;

    private Collection<User> users;

    @PostConstruct
    public void initialize() {
        users = userRepository.findAll();
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void remove(User user) {
        userRepository.remove(user);
        users.remove(user);
    }
}
