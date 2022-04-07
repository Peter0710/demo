package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * (Order)表实体类
 *
 * @author leo
 * @since 2022-03-28 11:27:06
 */
@Data
@TableName("Order")
public class Order implements Serializable{
    private static final long serialVersionUID = -61232913481547984L;
    /**
    * order_id
    */  
    @TableField("order_id")
    private Integer orderId;
    /**
    * address
    */  
    @TableField("address")
    private String address;
    /**
    * price
    */  
    @TableField("price")
    private BigDecimal price;
    /**
    * product_id
    */  
    @TableField("product_id")
    private Integer productId;
    /**
    * amount
    */  
    @TableField("amount")
    private Integer amount;
}

