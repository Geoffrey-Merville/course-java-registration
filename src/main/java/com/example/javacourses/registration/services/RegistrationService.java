package com.example.javacourses.registration.services;

import com.example.javacourses.appuser.entities.AppUser;
import com.example.javacourses.appuser.enums.AppUserRole;
import com.example.javacourses.appuser.services.AppUserService;
import com.example.javacourses.registration.EmailValidator;
import com.example.javacourses.registration.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
