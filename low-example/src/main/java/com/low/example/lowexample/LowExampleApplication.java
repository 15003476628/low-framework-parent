package com.low.example.lowexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LowExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(LowExampleApplication.class, args);
        log.info("low-example 服务启动成功");
    }

}
