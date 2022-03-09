package com.example.demo_user.repositories;

import com.example.demo_user.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<CategoryEntity, Long> {
    CategoryEntity findOneByCode(String code); //findone lấy singgo lên
}
