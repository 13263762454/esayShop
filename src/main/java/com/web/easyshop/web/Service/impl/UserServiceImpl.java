package com.web.easyshop.web.Service.impl;

import com.web.easyshop.web.Entity.UserEntity;
import com.web.easyshop.web.Mapper.UserMapper;
import com.web.easyshop.web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> getUserList()
    {
        return userMapper.getUsers();
    }

}
