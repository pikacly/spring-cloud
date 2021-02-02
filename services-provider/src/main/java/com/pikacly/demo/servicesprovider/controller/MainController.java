package com.pikacly.demo.servicesprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ly
 * @version 1.0
 * @date 2021/2/2 2:23 下午
 * @project spring-cloud
 * @package com.pikacly.demo.servicesprovider.controller
 * @description
 */
@RestController
public class MainController {
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }
}
