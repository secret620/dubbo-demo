package com.dubbo.demo.provider.user;

import com.dubbo.demo.api.user.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Shi You Qin
 * @description 表示 ：
 * @email secret620@163.com
 * @date CreateTime 2021/4/14 12:59
 **/
@DubboService(version = "1.0", group = "test")
public class UserServiceImpl implements UserService {
    @Override
    public String say(String userName) {
        return "张三";
    }
}
