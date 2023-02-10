package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.User;

import java.util.List;

/**
 * @Author zky
 * @Date:2022/07/19/10:20
 * @Description:
 */
public interface UserService extends IService<User> {

    /**
    * @Description: 根据用户名和密码来获取用户
    * @Param: [name, password]
    * @return: java.util.List<com.example.demo.domain.User>
    * @Author: zky
    * @Date: 2022/7/20
    */
    List<User> getUserByNameAndPassword(String name,String password);

    /**
    * @Description: 通过用户名获取用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    List<User> getUserByName(String name);
    
    /**
    * @Description: 添加用户
    * @Param: [name, password]
    * @return: boolean
    * @Author: zky
    * @Date: 2022/7/21
    */
    boolean addUser(String name,String password);

    /**
    * @Description: 删除用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    boolean deleteUserById(int id);

    /**
    * @Description: 修改用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    boolean updateUser(User user);
}