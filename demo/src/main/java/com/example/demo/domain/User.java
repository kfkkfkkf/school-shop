package com.example.demo.domain;


import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author zky
 * @Date 2022/7/19
 */
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String password;
}