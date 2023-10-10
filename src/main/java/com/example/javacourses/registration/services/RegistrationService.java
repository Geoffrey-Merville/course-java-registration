package com.example.javacourses.registration.services;

import com.example.javacourses.registration.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public static String register(RegistrationRequest request) {
        return "works";
    }
}
