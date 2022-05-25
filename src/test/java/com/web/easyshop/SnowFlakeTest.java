package com.web.easyshop;

import com.web.easyshop.web.Util.SnowFlake;
import org.junit.jupiter.api.Test;

public class SnowFlakeTest {

    /**
     * 测试用snowflake生成id
     * @throws InterruptedException
     */
    @Test
    void test() throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        long startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            long id = SnowFlake.generateId();
            System.out.println(id);
        }
        System.out.println((System.nanoTime()-startTime)/1000000+"ms");
    }
}
