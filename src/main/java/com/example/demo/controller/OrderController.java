package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.common.Response;
import java.util.List;

import javax.annotation.Resource;

/**
 * (Order)控制层
 *
 * @author leo
 * @since 2022-03-28 11:51:42
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 通过主键查询单条数据
     *
     * @param order 参数对象
     * @return 单条数据
     */
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Response selectOne(Order order) {
        Order result = orderService.selectById(order.getOrderId());
        if(result != null){
            Response.success();
        }
        return Response.error();
    }
    
    /**
     * 新增一条数据
     *
     * @param order 实体类
     * @return Response对象
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Response insert(@RequestBody Order order) {
        int result = orderService.insert(order);
        if (result > 0) {
            Response.success();
        }
        return Response.error();
    }

    /**
     * 修改一条数据
     *
     * @param order 实体类
     * @return Response对象
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public Response update(@RequestBody Order order) {
        Order result = orderService.update(order);
        if (result != null) {
            Response.success(result);
        }
        return Response.error();
    }

    /**
     * 删除一条数据
     *
     * @param order 参数对象
     * @return Response对象
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public Response delete(Order order) {
        int result = orderService.deleteById(order.getOrderId());
        if (result > 0) {
            Response.success();
        }
        return Response.error();
    }

    /**
     * 查询全部
     *
     * @return Response对象
     */
    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    public Response selectAll() {
        List<Order> orders = orderService.selectAll();
        if (orders != null) {
            Response.success(orders);
        }
        return Response.error();
    }
}
