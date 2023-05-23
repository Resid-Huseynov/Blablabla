package com.example.Blablabla.repository;

import com.example.Blablabla.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User existsByUsername(String username);
}
