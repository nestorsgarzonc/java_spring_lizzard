package com.example.lizzard.service;

import com.example.lizzard.model.User;
import com.example.lizzard.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
