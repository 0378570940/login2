package com.example.demo_user.dto;

import com.example.demo_user.entities.UserNameEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserDto {
    static long id;
//    @NotBlank(message = "Không được phép rỗng")
//    @Size(message = "nhập ít nhất 6 ký tự", min =6)
    static String username;
//    @NotBlank(message = "Không được phép rỗng")
//    @Size(message = "nhập ít nhất 6 ký tự", min =6)
    static String password;
    static String email;

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
