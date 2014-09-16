package com.realdolmen.registration.controller;

import com.realdolmen.registration.domain.User;
import com.realdolmen.registration.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;
import java.util.Date;

@Named
@RequestScoped
public class UserController {
    @Inject
    private UserRepository userRepository;

    private Collection<User> users;

    @PostConstruct
    public void initialize() {
        users = userRepository.findAll();
        users.add(new User("Kevin", "Van Robbroeck", new Date()));
    }

    public Collection<User> getUsers() {
        return users;
    }

    public String remove(User user) {
        userRepository.remove(user);
//        return "users";
        return "users?faces-redirect=true";
    }
}
