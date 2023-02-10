package com.example.shoolstore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shoolstore.domain.User;

import java.util.List;

public interface UserService extends IService<User> {

    /**
     * @Description: 根据用户名和密码来获取用户
     * @Param: [name, password]
     * @return: java.util.List<com.example.demo.domain.User>
     * @Author: zky
     * @Date: 2022/7/20
     */
    List<User> getAllUser();

    List<User> getUserByNameAndPassword(String name,String password);

    List<User> getUserByName(String name);

    boolean addUser(String name,String password,int type);

}
