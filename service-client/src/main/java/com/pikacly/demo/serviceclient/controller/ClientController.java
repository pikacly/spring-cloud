package com.pikacly.demo.serviceclient.controller;

import com.pikacly.demo.serviceclient.api.MainApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ly
 * @version 1.0
 * @date 2021/2/2 2:33 下午
 * @project spring-cloud
 * @package com.pikacly.demo.serviceclient.controller
 * @description
 */
@RestController
public class ClientController {
    @Autowired
    private MainApi mainApi;

    @GetMapping("test")
    @ResponseBody
    public String test() {
        return mainApi.hello();
    }
}
