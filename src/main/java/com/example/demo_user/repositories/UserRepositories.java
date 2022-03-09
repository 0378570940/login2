package com.example.demo_user.repositories;

import com.example.demo_user.entities.UserNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<UserNameEntity, Long> {
}
