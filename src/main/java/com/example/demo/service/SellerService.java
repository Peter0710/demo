package com.example.demo.service;

import com.example.demo.entity.Seller;

import java.util.List;
import java.util.Map;

/**
 * (Seller)表服务接口
 *
 * @author leo
 * @since 2022-03-28 10:53:00
 */
public interface SellerService {

    /**
     * 通过ID查询单条数据
     *
     * @param sellerId 主键
     * @return 实例对象
     */
    Seller selectById(Integer sellerId);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Seller> selectAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param seller 实例对象
     * @return 对象列表
     */
    List<Seller> selectList(Seller seller);

    /**
     * 新增数据
     *
     * @param seller 实例对象
     * @return 影响行数
     */
    int insert(Seller seller);


    /**
     * 修改数据
     *
     * @param seller 实例对象
     * @return 修改
     */
    Seller update(Seller seller);

    /**
     * 通过主键删除数据
     *
     * @param sellerId 主键
     * @return 影响行数
     */
    int deleteById(Integer sellerId);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}


