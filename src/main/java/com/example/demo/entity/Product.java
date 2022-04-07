package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * (Product)表实体类
 *
 * @author leo
 * @since 2022-03-28 11:27:06
 */
@Data
@TableName("Product")
public class Product implements Serializable{
    private static final long serialVersionUID = -42499831389670054L;
    /**
    * product_id
    */  
    @TableField("product_id")
    private Integer productId;
    /**
    * name
    */  
    @TableField("name")
    private String name;
    /**
    * intro
    */  
    @TableField("intro")
    private String intro;
    /**
    * price
    */  
    @TableField("price")
    private BigDecimal price;
    /**
    * seller_id
    */  
    @TableField("seller_id")
    private Integer sellerId;
    /**
    * amount
    */  
    @TableField("amount")
    private Integer amount;
}

