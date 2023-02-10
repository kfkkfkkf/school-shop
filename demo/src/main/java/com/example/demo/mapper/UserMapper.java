package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author zky
 * @Date:2022/07/19/10:18
 * @Description:
 */
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
    List<User> getUsers();

    /**
    * @Description: 根据用户名和密码来获取用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/20
    */
    @Select("select * from user where name=#{name} and password=#{password}")
    List<User> getUsersByNameAndPassword(String name,String password);

    /**
    * @Description: 通过用户名查找用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    @Select("select * from user where name=#{name}")
    List<User> getUserByName(String name);

    /**
    * @Description: 添加用户
    * @Param: [name, password]
    * @return: boolean
    * @Author: zky
    * @Date: 2022/7/21
    */
    @Insert("insert into user(name, password) values(#{name},#{password})")
    boolean addUser(String name,String password);

    /**
    * @Description: 删除用户
    * @Param: [id]
    * @return: boolean
    * @Author: zky
    * @Date: 2022/7/21
    */
    @Delete("delete from user where id=#{id}")
    boolean deleteUserById(int id);

    /**
    * @Description: 修改用户
    * @Param:
    * @return:
    * @Author: zky
    * @Date: 2022/7/21
    */
    @Update("update user set name=#{name},password=#{password} where id=#{id}")
    boolean updateUser(int id,String name,String password);

}