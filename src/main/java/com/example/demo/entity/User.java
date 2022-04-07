package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)表实体类
 *
 * @author leo
 * @since 2022-03-28 11:27:06
 */
@Data
@TableName("User")
public class User implements Serializable{
    private static final long serialVersionUID = -77080743696949001L;
    /**
    * user_id
    */  
    @TableField("user_id")
    private Integer userId;
    /**
    * name
    */  
    @TableField("name")
    private String name;
    /**
    * address
    */  
    @TableField("address")
    private String address;
    /**
    * password
    */  
    @TableField("password")
    private String password;
    /**
    * phone
    */  
    @TableField("phone")
    private String phone;
}

