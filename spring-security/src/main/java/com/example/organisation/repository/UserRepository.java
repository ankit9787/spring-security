package com.example.organisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.organisation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
