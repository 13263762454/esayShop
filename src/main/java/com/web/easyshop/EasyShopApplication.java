package com.web.easyshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EasyShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyShopApplication.class, args);
    }

}
