package com.example.Blablabla.repository;

import com.example.Blablabla.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User existsByUsernam(String username);
}
