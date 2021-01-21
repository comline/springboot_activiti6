package com.island.activiti.web.controller.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.island.activiti.web.controller.hello
 * @Name: HelloController
 * @Description: TODO
 * @Author: comline@foxmail.com
 * @Create: 2021-01-21 17:49
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world,how are you?";
    }
}