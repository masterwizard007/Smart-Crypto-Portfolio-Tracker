package com.example.smartcryptoprotfoliotracker.mapper;

import com.example.smartcryptoprotfoliotracker.dto.UserRequest;
import com.example.smartcryptoprotfoliotracker.dto.UserResponse;
import com.example.smartcryptoprotfoliotracker.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);

    @Mapping(target = "userId", ignore = true)
    User toEntity(UserRequest request);

    List<UserResponse> toResponseList(List<User> userList);
}
