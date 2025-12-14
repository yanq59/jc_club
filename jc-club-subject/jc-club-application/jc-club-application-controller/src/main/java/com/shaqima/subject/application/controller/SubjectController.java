package com.shaqima.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题controller
 *
 * @Author : qi
 * @create 2025/12/14 23:31
 */
@RestController
public class SubjectController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
