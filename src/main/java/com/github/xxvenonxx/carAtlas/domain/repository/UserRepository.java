package com.github.xxvenonxx.carAtlas.domain.repository;

import com.github.xxvenonxx.carAtlas.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
