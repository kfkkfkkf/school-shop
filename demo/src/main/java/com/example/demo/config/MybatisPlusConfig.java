package com.example.demo.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Configuration
//扫描的mapper文件路径
@MapperScan(value = "com.example.demo.mapper")
public class MybatisPlusConfig {

    /**
    * @Description: 分页插件
    * @Param: []
    * @return: com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
    * @Author: zky
    * @Date: 2022/7/19
    */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
