package com.example.demo_user.service;

import com.example.demo_user.dto.NewDto;

public interface iNewservice {
    //thêm dữ liệu
    NewDto save(NewDto newDto);
    //update cập nhập dữ liệu
    NewDto update(NewDto newDto);
}
