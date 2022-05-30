package com.web.easyshop.web.Controller;

import com.web.easyshop.web.Util.Response;
import com.web.easyshop.web.Util.Rotation;
import com.web.easyshop.web.Vo.Test;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.Arrays;

@RestController
@RequestMapping("web")
public class Home {

    protected String name = "zs";

    @RequestMapping("getProduct")
    public <T>Object getProduct(
            @RequestParam(name = "id", defaultValue = "0", required = false) int id
    )
    {
        return Response.Success("请求成功！", id);
    }

    @PostMapping("testBody")
    public <T>Object testBody(
            @RequestBody Test test
    )
    {
        System.out.println(test);
        return Response.Success("请求成功！", test);
    }

    @RequestMapping("testThred")
    public void testThred()
    {
        test("售票口1");
        test("售票口2");
        test("售票口3");
    }

    @RequestMapping("testRotation")
    public void testRotation()
    {
        System.out.println(Rotation.getIp());
    }

    public void test(final String shopName){
        try{
            new Thread(){
                @SneakyThrows
                @Override
                public void run() {
                    int i = 0;
                    while(i <= 10){
                        Thread.sleep(1000);
//                        BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
//                        out.write("菜鸟教程");
//                        out.close();
                        FileOutputStream out = new FileOutputStream(new File("runoob.txt"), true);
                        byte buffer[] = new String("hello world!\r\n").getBytes();
                        out.write(buffer, 0, buffer.length);
                        System.out.println(buffer);
//                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out, "utf-8");
//                        outputStreamWriter.append("hello");
//                        outputStreamWriter.append("\r\n");
                        name = shopName + i;
                        System.out.println(shopName + ":售票" + i);
                        System.out.println(name);
                        i++;
                    }
                }
            }.start();
        }catch (Exception e)
        {
            System.out.println(shopName + "：异常");
        }

    }
}
