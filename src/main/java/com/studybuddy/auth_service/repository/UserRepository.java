package com.studybuddy.auth_service.repository;

import com.studybuddy.auth_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<Object> findByUsername(String username);
}
