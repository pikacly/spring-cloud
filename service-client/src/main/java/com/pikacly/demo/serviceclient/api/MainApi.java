package com.pikacly.demo.serviceclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ly
 * @version 1.0
 * @date 2021/2/2 2:31 下午
 * @project spring-cloud
 * @package com.pikacly.demo.serviceclient.api
 * @description
 */
@FeignClient(name = "services-provider")
public interface MainApi {
    @RequestMapping(value = "hello")
    String hello();
}
