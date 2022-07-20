package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello") //URL과 hello 메서드를 매핑하는 역할 
    @ResponseBody
    public String hello() {
        return "Hello Spring Board";
    }
}
