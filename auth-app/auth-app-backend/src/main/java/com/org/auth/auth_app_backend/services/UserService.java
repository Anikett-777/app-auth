package com.org.auth.auth_app_backend.services;

import com.org.auth.auth_app_backend.dtos.UserDto;

import java.util.UUID;

public interface UserService {

    //create User
    UserDto createUSer(UserDto userDto);

    //get user by email
    UserDto getUserByEmail(String email);

    //Update User
    UserDto updateUSer(UserDto userDto, String userId);

    //delete User
    void deleteUser(String userId);

    //get User By Id
    UserDto getUserById(String userId);

    //Get All User
    Iterable<UserDto> getAllUsers();

}
