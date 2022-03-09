package com.example.demo_user.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "user_name", schema = "quanlywebthoitrang", catalog = "")
public class UserNameEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "usename")
    private String usename;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;

    public static List<UserNameEntity> getAll() {
        return null;
    }

    public void getUsename(String username) {

    }

    public void getPassword(String password) {
    }

    public void getEmail(String email) {
    }
}

