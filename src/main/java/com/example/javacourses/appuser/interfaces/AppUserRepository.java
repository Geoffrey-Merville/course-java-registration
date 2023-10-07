package com.example.javacourses.appuser.interfaces;

import com.example.javacourses.appuser.entities.AppUser;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface AppUserRepository {

    Optional<AppUser> findByEmail(String email);
}
