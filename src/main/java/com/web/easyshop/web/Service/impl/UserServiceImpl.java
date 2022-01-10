package com.web.easyshop.web.Service.impl;

import com.web.easyshop.web.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getUserList()
    {
        List<String> userList = new ArrayList<String>();
        userList.add("a");
        return userList;
    }

}
