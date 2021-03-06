package com.geekpi.basegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class BaseGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseGatewayApplication.class, args);
    }

}
