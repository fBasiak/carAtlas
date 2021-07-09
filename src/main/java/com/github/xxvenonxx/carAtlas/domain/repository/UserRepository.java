package com.github.xxvenonxx.carAtlas.domain.repository;

import com.github.xxvenonxx.carAtlas.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
