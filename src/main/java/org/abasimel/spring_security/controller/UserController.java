package org.abasimel.spring_security.controller;

import org.abasimel.spring_security.model.Users;
import org.abasimel.spring_security.repository.UserRepo;
import org.abasimel.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.register(user);


    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){

        return userService.verify(user);

    }
}
