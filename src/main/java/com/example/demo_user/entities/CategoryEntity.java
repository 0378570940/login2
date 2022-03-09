package com.example.demo_user.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "quanlywebthoitrang", catalog = "")
public class CategoryEntity {
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "code", nullable = true)
    private Long code;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
}
