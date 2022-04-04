package com.web.easyshop;

import com.web.easyshop.web.Enum.ResultCodeEnum;
import com.web.easyshop.web.Util.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResultCodeEnumTest {

    @Test
    public void testResultCodeEnum() {
        System.out.println(ResultCodeEnum.SUCCESS.getCode());
        System.out.println(ResultCodeEnum.SUCCESS.getMessage());
    }

    @Test
    public void testApiResult() {
        System.out.println(ResultCodeEnum.SUCCESS.getCode());
        System.out.println(ResultCodeEnum.SUCCESS.getMessage());
        System.out.println(Response.Error());
    }
}
