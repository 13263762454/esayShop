package com.web.easyshop.web.Entity;

import lombok.Data;

@Data
public class UserEntity {
    Long id;
    String username;
    String password;
    String updateTime;
    String createTime;
    int is_del;
}
