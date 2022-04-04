package com.web.easyshop.web.Controller;

import com.web.easyshop.web.Entity.UserEntity;
import com.web.easyshop.web.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import com.web.easyshop.web.Util.Response;

@RestController
@RequestMapping("user")
class UserController {

    @Resource
    UserService userService;

    @RequestMapping("getUserList")
    <T>Object getUserList(
//            @RequestBody UserDto userDto
            ) {
        try {
            List<UserEntity> userList = userService.getUserList();

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
