package com.example.back.repository;

import com.example.back.domain.user.Role;
import com.example.back.domain.user.User;

import java.util.Optional;
public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId,  Long taskId);

    void delete(Long id);

}
