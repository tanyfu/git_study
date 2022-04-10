package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(){
        User user = new User();
        user.setUsername( "张三" );
        int i = userService.saveUser( user );
        System.out.println("==========插入结果返回:"+i);
        return "========插入成功========="+i;
    }
}
