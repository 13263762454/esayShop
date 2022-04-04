package com.web.easyshop.web.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class Schedule {

//    @Scheduled(fixedRateString = "2000")
    void test(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-mm-dd HH:mm:ss");
        System.out.println("this Schedule test method Date:" + simpleDateFormat.format(new Date()));
    }
}
