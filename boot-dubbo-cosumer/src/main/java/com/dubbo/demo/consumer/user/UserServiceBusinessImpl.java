package com.dubbo.demo.consumer.user;

import com.dubbo.demo.api.user.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Shi You Qin
 * @description 表示 ：
 * @email secret620@163.com
 * @date CreateTime 2021/4/14 14:01
 **/
@Service
public class UserServiceBusinessImpl implements UserServiceBusiness {

    @DubboReference(version = "1.0", group = "test")
    UserService userService;

    @Override
    public String say(String userName) {
        String serviceRef = userService.say("");
        return "服务端传递的名字："+serviceRef+"，我是客户端返回的名字："+userName;
    }
}
