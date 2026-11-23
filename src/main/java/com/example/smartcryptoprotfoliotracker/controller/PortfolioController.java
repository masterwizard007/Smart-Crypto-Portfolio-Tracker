package com.example.smartcryptoprotfoliotracker.controller;

import com.example.smartcryptoprotfoliotracker.dto.UserRequest;
import com.example.smartcryptoprotfoliotracker.dto.UserResponse;
import com.example.smartcryptoprotfoliotracker.entity.User;
import com.example.smartcryptoprotfoliotracker.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/scpt")
public class PortfolioController {

    private final UserService userService;

    private PortfolioController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    private List<UserResponse> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping("/user")
    private User createUser(@RequestBody UserRequest userRequest){
        log.info("User request {}", userRequest.toString());
        return userService.create(userRequest);
    }

}
