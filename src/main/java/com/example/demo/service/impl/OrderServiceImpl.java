package com.example.demo.service.impl;

import com.example.demo.dao.OrderMapper;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Order表)服务实现类
 *
 * @author leo
 * @since 2022-03-28 10:52:59
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public Order selectById(Integer orderId) {
        return this.orderMapper.selectById(orderId);
    }


    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Order> selectAll() {
        return this.orderMapper.selectList(null);
    }

    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Order> selectList(Order order) {
        return this.orderMapper.selectList(null);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Order order) {
        return this.orderMapper.insert(order);
    }


    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderMapper.update(order, null);
        return this.selectById(order.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer orderId) {
        return this.orderMapper.deleteById(orderId);
    }

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    @Override
    public int count() {
        return this.orderMapper.selectCount(null);
    }
}

