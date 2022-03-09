package com.example.demo_user.service;

import com.example.demo_user.Util.DbUtil;
import com.example.demo_user.dto.UserDto;
import com.example.demo_user.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepositories userRepositories;

    public boolean saveUsername(UserDto userDto) {
        StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO category (name, description) VALUES (");
            sql.append("'").append(UserDto.getId()).append("',");
            sql.append("'").append(UserDto.getUsername()).append("',");
            sql.append(UserDto.getPassword()).append(",");
            sql.append("'").append(UserDto.getEmail()).append("')");
            return DbUtil.saveDb(sql.toString());

    }
}
