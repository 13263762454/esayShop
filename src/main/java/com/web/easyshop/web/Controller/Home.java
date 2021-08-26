package com.web.easyshop.web.Controller;

import com.web.easyshop.web.Util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web")
public class Home {

    @RequestMapping("getProduct")
    public <T>Object getProduct(
            @RequestParam(name = "id", defaultValue = "0", required = false) int id
    )
    {
        return Response.Success("请求成功！", id);
    }
}
