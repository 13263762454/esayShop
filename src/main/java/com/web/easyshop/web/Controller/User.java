package com.web.easyshop.web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class User {

    @RequestMapping("getUserInfo")
    public void getUserInfo()
    {
        System.out.println("a");
    }
}
