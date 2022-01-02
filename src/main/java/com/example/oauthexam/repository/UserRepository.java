package com.example.oauthexam.repository;

import com.example.oauthexam.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String username);
}
