package com.pikacly.demo.servicesprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qluyao
 */
@SpringBootApplication
@EnableEurekaClient
public class ServicesProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesProviderApplication.class, args);
    }

}
