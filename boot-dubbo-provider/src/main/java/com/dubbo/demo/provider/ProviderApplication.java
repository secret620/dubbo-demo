package com.dubbo.demo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Shi You Qin
 * @description 表示 ：
 * @email secret620@163.com
 * @date CreateTime 2021/4/13 20:30
 *  开放端口（开放后需要要重启防火墙才生效）
 *    firewall-cmd --zone=public --add-port=80/tcp --permanent
 *    firewall-cmd --zone=public --add-port=2181/tcp --permanent
 *    firewall-cmd --zone=public --add-port=7070/tcp --permanent
 *    firewall-cmd --zone=public --add-port=8848/tcp --permanent
 *配置立即生效
 * firewall-cmd --reload
 *    查看防火墙某个端口是否开放
 * firewall-cmd --query-port=2181/tcp
 **/
/*注解扫描*/
@EnableDubbo(scanBasePackages = "com.dubbo.demo")
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
