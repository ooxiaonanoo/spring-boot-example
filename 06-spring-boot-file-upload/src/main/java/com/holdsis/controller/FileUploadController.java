package com.holdsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileUploadController {

    //1.注意，该处“fileName”与fileUpload.html页面file控件名字一致
    //2.当RequestMapping与与fileUpload同名时，会直接访问到Controller
    @RequestMapping("/fileUploadController")
    @ResponseBody
    public Map<String, Object> fileUpload(MultipartFile fileName) {

        Map<String, Object> map = new HashMap();
        try {
            System.out.println(fileName.getOriginalFilename());

            String userDir = System.getProperties().getProperty("user.dir");

            fileName.transferTo(new File(userDir + "\\" + fileName.getOriginalFilename()));

            map.put("Message", "Success");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("Message", "Error");
        } finally {
            return map;
        }
    }
}
