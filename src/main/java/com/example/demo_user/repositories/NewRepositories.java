package com.example.demo_user.repositories;

import com.example.demo_user.entities.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepositories extends JpaRepository<NewEntity, Long> {
}
