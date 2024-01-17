package com.sparta.springmvc.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "Post Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "Put method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "Delete method 요청";
    }
}
