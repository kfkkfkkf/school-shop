package com.example.shoolstore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shoolstore.domain.User;
import com.example.shoolstore.mapper.UserMapper;
import com.example.shoolstore.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getUserByNameAndPassword(String name, String password) {
        return userMapper.getUsersByNameAndPassword(name,password);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUsersByName(name);
    }

    @Override
    public boolean addUser(String name, String password, int type) {
        return userMapper.addUser(name,password,type);
    }


}
