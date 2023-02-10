package com.example.shoolstore.controller;

import com.example.shoolstore.domain.User;
import com.example.shoolstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping("/getAllUser")
    public List getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/login")
    public String login(@RequestParam("user_name") String user_name,@RequestParam("user_password")String user_password){
        List<User> list =userService.getUserByNameAndPassword(user_name,user_password);
        if(list.isEmpty()){
            return "登录失败";
        }
        return "登录成功";
    }

    @PostMapping("/regist")
    public String login(@RequestParam("user_name") String user_name,@RequestParam("user_password")String user_password,
                        @RequestParam("user_type")int user_type){
        List<User> list =userService.getUserByName(user_name);
        if(list.isEmpty()){
            if(userService.addUser(user_name,user_password,user_type)){
                return "注册成功";
            }
            return "注册失败";
        }
        else{
            return "该用户名已存在,请重新输入";
        }
    }


}
