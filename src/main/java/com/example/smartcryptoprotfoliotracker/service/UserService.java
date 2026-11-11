package com.example.smartcryptoprotfoliotracker.service;

import com.example.smartcryptoprotfoliotracker.entity.User;
import com.example.smartcryptoprotfoliotracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
