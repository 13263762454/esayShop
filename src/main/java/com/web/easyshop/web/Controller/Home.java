package com.web.easyshop.web.Controller;

import com.web.easyshop.web.Util.Response;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("testThred")
    public void testThred()
    {
        test("售票口1");
        test("售票口2");
        test("售票口3");
    }

    public void test(String shopName){
        try{
            new Thread(){
                @SneakyThrows
                @Override
                public void run() {
                    int i = 0;
                    while(i <= 10){
                        Thread.sleep(1000);
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
