package com.web.easyshop.web.controller;

import com.web.easyshop.web.dto.UserDto;
import com.web.easyshop.web.service.UserService;
import com.web.easyshop.web.utils.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class User {

    @Resource
    UserService userService;

    @RequestMapping("getUserList")
    <T>Object getUserList(
            @RequestBody UserDto userDto
            )
    {
        try {
            System.out.println(userDto);
            List userList = userService.getUserList();
            return Response.Success(userList);
        }catch (Exception e){
            return Response.Error(e.getMessage());
        }
    }
}
