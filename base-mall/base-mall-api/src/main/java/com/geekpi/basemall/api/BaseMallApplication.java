package com.geekpi.basemall.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@MapperScan("com.geek-pi.**.mapper")
public class BaseMallApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(BaseMallApplication.class, args);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
