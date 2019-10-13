package com.simple.demo;

import com.simple.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demoController {
    @Autowired
    private Person person;

    @Value("${a}")
    private String a;

    @Value(("${name}"))
    private String name;
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return name +person.getName() + person.getAge() + person.getBirth() + String.valueOf(a);
    }
}
