package com.dubbo.demo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Shi You Qin
 * @description 表示 ：
 * @email secret620@163.com
 * @date CreateTime 2021/4/13 20:33
 **/
@EnableDubbo(scanBasePackages = "com.dubbo.demo")
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
