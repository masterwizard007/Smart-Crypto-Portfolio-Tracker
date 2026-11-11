package com.example.smartcryptoprotfoliotracker.controller;

import com.example.smartcryptoprotfoliotracker.entity.User;
import com.example.smartcryptoprotfoliotracker.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scpt")
public class PortfolioController {

    private final UserService userService;

    private PortfolioController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    private List<User> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping("/user")
    private User createUser(@RequestBody User user){
        return userService.create(user);
    }

}
