package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
    * @Description: 返回用户表
    * @Param:
    * @return: java.util.List
    * @Author: zky
    * @Date: 2022/7/19
    */
    @ResponseBody
    @RequestMapping("/getUser")
    public List user() {
        return userService.list();
    }

    /**
    * @Description: 按照用户id获取用户
    * @Param: [id]
    * @return: com.example.demo.domain.User
    * @Author: zky
    * @Date: 2022/7/20
    */
    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById(@RequestParam("id")int id){
        return userService.getById(id);
    }

//    /**
//    * @Description: 按照用户名获取用户
//    * @Param: [name]
//    * @return: com.example.demo.domain.User
//    * @Author: zky
//    * @Date: 2022/7/20
//    */
//    @ResponseBody
//    @RequestMapping("/getUserByName")
//    public User getUserByName(@RequestParam("name")String name){
//        return userService.getUserByName(name);
//    }

    /**
    * @Description: 通过用户名和密码获取用户
    * @Param: [name, password]
    * @return: java.util.List<com.example.demo.domain.User>
    * @Author: zky
    * @Date: 2022/7/21
    */
    @ResponseBody
    @RequestMapping("/getUserByNameAndPassword")
    public List<User> getUserByNameAndPassword(@RequestParam("name")String name,
                                               @RequestParam("password")String password){

        return userService.getUserByNameAndPassword(name,password);
    }

    /**
    * @Description: 添加用户
    * @Param: [name, password]
    * @return: boolean
    * @Author: zky
    * @Date: 2022/7/21
    */
    @ResponseBody
    @RequestMapping("/addUser")
    public boolean addUser(@RequestParam("name")String name,@RequestParam("password")String password){
        return userService.addUser(name,password);
    }

    /**
    * @Description: 通过id删除用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    @ResponseBody
    @RequestMapping("/deleteUserById")
    public boolean deleteUserById(int id){
        return userService.deleteUserById(id);
    }

    /**
    * @Description: 修改用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    @ResponseBody
    @RequestMapping("/updateUser")
    public boolean updateUser(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("password")String password){
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        return userService.updateUser(user);
    }

    @ResponseBody
    @RequestMapping("/getUserPage")
    public List<User> getUserPage(@RequestParam("page")int page){
        return userService.list().subList(5*(page-1),5*page);

    }
}