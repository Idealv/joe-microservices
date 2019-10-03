package com.joe.uaa.oauth.repository;

import com.joe.uaa.oauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
