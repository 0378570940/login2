package com.example.demo_user.controller;

import com.example.demo_user.dto.NewDto;
import com.example.demo_user.service.impl.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //đây là controller
public class Newthem {
    @Autowired
    private NewService newService;

    //thêm dữ liệu vào trong database
    @PostMapping(value = "/new") //đường dẫn web
    public NewDto createNew(@RequestBody NewDto model){
        return newService.save(model);
    }

    //sửa dữ liệu
    @PutMapping(value = "/new/{id}")//đường dẫn web
    public  NewDto updateNew(NewDto model, @PathVariable("id") long id){
        model.setId(id);
        return newService.save(model);
    }

    //xóa dữ liệu
//    @DeleteMapping(value = "/new")
//    public  NewDto deleteNew(@ResponseBody long[] ids){
//        return ids;
//    }
}
