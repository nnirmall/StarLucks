package com.nnirmall.user_service.repository;

import com.nnirmall.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    public User findById(UUID id);
    Optional<User> findByUsername(String username);
}
