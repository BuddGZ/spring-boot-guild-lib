package com.geekpi.baseregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BaseRegisterApplication {

    public static void main(String[] args) {

        SpringApplication.run(BaseRegisterApplication.class, args);
    }

}
