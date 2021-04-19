package com.geekpi.basegateway.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class Test {

    public String request(){
        log.debug("请求到了");
        return "test";
    }
}
