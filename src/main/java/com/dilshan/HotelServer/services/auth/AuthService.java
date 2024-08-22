package com.dilshan.HotelServer.services.auth;

import com.dilshan.HotelServer.dto.SignupRequest;
import com.dilshan.HotelServer.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
}
