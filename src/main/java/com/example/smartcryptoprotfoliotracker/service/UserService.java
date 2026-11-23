package com.example.smartcryptoprotfoliotracker.service;

import com.example.smartcryptoprotfoliotracker.dto.UserRequest;
import com.example.smartcryptoprotfoliotracker.dto.UserResponse;
import com.example.smartcryptoprotfoliotracker.entity.User;
import com.example.smartcryptoprotfoliotracker.mapper.UserMapper;
import com.example.smartcryptoprotfoliotracker.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    private UserService(UserRepository userRepository, UserMapper userMapper){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserResponse> getAll() {
        List<User> users = userRepository.findAll();
        return  userMapper.toResponseList(users);
    }

    public User create(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        log.info("User object {}", user.toString());
        return userRepository.save(user);
    }
}
