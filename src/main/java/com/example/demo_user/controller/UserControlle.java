package com.example.demo_user.controller;

import com.example.demo_user.dto.UserDto;
import com.example.demo_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;
import java.util.List;

@RestController //@RestController dùng cho API
@RequestMapping("backend/user")
public class UserControlle {
    // Inject Service vào để gọi được
    @Autowired // Dùng cách này cho ngắn, chứ thường là inject qua constructor
    UserService userService;

    @GetMapping("/them")    // đánh dấu đường dẫn của web
    public UserService them(Model model, UserService userService) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        List<UserService> khachHangdtos = getList();
        model.addAttribute("them mới thành công", userService);
        return userService;
    }

    private List<UserService> getList() {
        return null;
    }
//    @RequestMapping(value = "them1", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    // đánh dấu đường dẫn của web
//    public String them(Model model, UserDto userDto) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
//        boolean result = userService.saveUsername(userDto);
//        model.addAttribute("userDto", "tạo mới thành công");
//        return "result";
//    }

}
