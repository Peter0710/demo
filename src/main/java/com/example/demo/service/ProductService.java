package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * (Product)表服务接口
 *
 * @author leo
 * @since 2022-03-28 10:53:00
 */
public interface ProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    Product selectById(Integer productId);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Product> selectAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    List<Product> selectList(Product product);

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int insert(Product product);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 修改
     */
    Product update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 影响行数
     */
    int deleteById(Integer productId);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();

    Boolean second();
}


