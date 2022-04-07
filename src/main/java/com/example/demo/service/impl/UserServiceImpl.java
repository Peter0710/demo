package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (User表)服务实现类
 *
 * @author leo
 * @since 2022-03-28 10:53:01
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public User selectById(Integer userId) {
        return this.userMapper.selectById(userId);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
    @Override
    public List<User> selectAll() {
        return this.userMapper.selectList(null);
    }

    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<User> selectList(User user) {
        return this.userMapper.selectList(null);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(User user) {
        return this.userMapper.insert(user);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userMapper.update(user, null);
        return this.selectById(user.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer userId) {
        return this.userMapper.deleteById(userId);
    }

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    @Override
    public int count() {
        return this.userMapper.selectCount(null);
    }
}

