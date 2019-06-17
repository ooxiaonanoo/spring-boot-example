package com.holdsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> showHello() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg","Hello World!");
        return map;
    }


}
