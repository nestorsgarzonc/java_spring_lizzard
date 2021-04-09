package com.example.lizzard.service;

import com.example.lizzard.model.User;
import com.example.lizzard.web.sto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
