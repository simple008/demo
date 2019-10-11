package com.simple.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demoController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "xxxx";
    }
}
