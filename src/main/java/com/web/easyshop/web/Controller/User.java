package com.web.easyshop.web.controller;

import com.web.easyshop.web.Service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import com.web.easyshop.web.Util.Response;

@RestController
@RequestMapping("user")
public class User {

    @Resource
    UserService userService;

    @RequestMapping("getUserList")
    <T>Object getUserList(
            @RequestBody UserDto userDto
            ) {
        try {
            List<String> userList = userService.getUserList();

            return Response.Success(userList);
        } catch (Exception e) {
            return Response.Error(e.getMessage());
        }
    }


    @RequestMapping("getUserInfo")
    public void getUserInfo()
    {
        System.out.println("a");
    }
}
