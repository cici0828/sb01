package com.fengwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UserController {
    @RequestMapping("/hello")
    public String HelloWorld(){
        return "testtt11111";
    }
}
