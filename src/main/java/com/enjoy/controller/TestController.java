package com.enjoy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhanglisheng
 * @create: 2019-04-18 16:14
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
       return "test";
    }
}
