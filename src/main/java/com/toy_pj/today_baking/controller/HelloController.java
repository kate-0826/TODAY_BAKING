package com.toy_pj.today_baking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "안녕 지티야! 🍞 Spring은 살아있다!";
    }

    @GetMapping("/")
    public String root() {
        return "루트도 OK! 🙌";
    }
}
