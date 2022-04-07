package com.example.demo.service;

import com.example.demo.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * (Order)表服务接口
 *
 * @author leo
 * @since 2022-03-28 10:52:59
 */
public interface OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    Order selectById(Integer orderId);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Order> selectAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param order 实例对象
     * @return 对象列表
     */
    List<Order> selectList(Order order);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int insert(Order order);


    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 修改
     */
    Order update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(Integer orderId);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}


