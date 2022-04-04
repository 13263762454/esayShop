package com.web.easyshop.web.Mapper;

import com.web.easyshop.web.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserEntity> getUsers();

}
