package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

/**
 * (User)表服务接口
 *
 * @author leo
 * @since 2022-03-28 10:53:00
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    User selectById(Integer userId);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<User> selectAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> selectList(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);


    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 修改
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}


