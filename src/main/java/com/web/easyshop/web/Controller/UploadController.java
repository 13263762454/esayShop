package com.web.easyshop.web.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class UploadController {

    /**
     * 文件上传
     *
     * @param name
     * @param multipartFile
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Object upload(String name, @RequestParam(value = "multipartFile") MultipartFile multipartFile)
            throws IllegalStateException, IOException {
        Map<String, Object> map = new HashMap<String, Object>();

        if (multipartFile != null) {
            // 设置文件名称
            map.put("nameParam", name);
            // 设置文件名称
            map.put("fileame", multipartFile.getName());
            // 设置文件类型
            map.put("contentType", multipartFile.getContentType());
            // 设置文件大小
            map.put("fileSize", multipartFile.getSize());
            // 创建文件名称
            String fileName = UUID.randomUUID() + "."
                    + multipartFile.getContentType().substring(multipartFile.getContentType().lastIndexOf("/") + 1);
            // 设置保存路径
            String filePath = System.getProperty("user.dir") + "/upload/images/" + fileName;
            // 打印保存路径
            System.out.println(filePath);
            // 保存文件的路径信息
            map.put("filePath", filePath);
            // 创建文件
            File saveFile = new File(filePath);
            // 文件保存
            multipartFile.transferTo(saveFile);
            // 返回信息
            return map;
        } else {
            return "no file ";
        }
    }

}
