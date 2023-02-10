package com.example.shoolstore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shoolstore.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * @Description: 获取所有用户
     * @Param:
     * @return:
     * @Author: zky
     * @Date: 2022/7/20
     */
    @Select("select * from user")
    List<User> getAllUser();

    @Select("select * from user where user_name=#{name} and user_password=#{password}")
    List<User> getUsersByNameAndPassword(String name,String password);

    @Select("select * from user where user_name=#{name}")
    List<User> getUsersByName(String name);

    /**
     * @Description: 添加用户
     * @Param: [name, password]
     * @return: boolean
     * @Author: zky
     * @Date: 2022/7/21
     */
    @Insert("insert into user(user_name, user_password,user_type) values(#{name},#{password},#{type})")
    boolean addUser(String name,String password,int type);

}
