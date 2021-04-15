package com.dubbo.demo.consumer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Shi You Qin
 * @description 表示 ：
 * @email secret620@163.com
 * @date CreateTime 2021/4/14 14:06
 **/
@Controller
public class UserController {

    @Autowired
    UserServiceBusiness userServiceBusiness;

    @ResponseBody
    @GetMapping(value = "say")
    public String sya(){
        return userServiceBusiness.say("李四");
    }

}
