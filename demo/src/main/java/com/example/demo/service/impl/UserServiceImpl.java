package com.example.demo.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zky
 * @Date:2022/07/19/10:21
 * @Description:
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserByNameAndPassword(String name, String password) {
        return userMapper.getUsersByNameAndPassword(name,password);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public boolean addUser(String name, String password) {
        return userMapper.addUser(name,password);
    }

    @Override
    public boolean deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user.getId(),user.getName(),user.getPassword());
    }
}