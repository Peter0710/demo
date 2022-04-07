package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (Seller)表实体类
 *
 * @author leo
 * @since 2022-03-28 11:27:06
 */
@Data
@TableName("Seller")
public class Seller implements Serializable{
    private static final long serialVersionUID = -79267601363719519L;
    /**
    * seller_id
    */  
    @TableField("seller_id")
    private Integer sellerId;
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
    * intro
    */  
    @TableField("intro")
    private String intro;
}

