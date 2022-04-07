package com.example.demo.service.impl;

import com.example.demo.dao.SellerMapper;
import com.example.demo.entity.Seller;
import com.example.demo.service.SellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Seller表)服务实现类
 *
 * @author leo
 * @since 2022-03-28 10:53:00
 */
@Service("sellerService")
public class SellerServiceImpl implements SellerService {
    @Resource
    private SellerMapper sellerMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param sellerId 主键
     * @return 实例对象
     */
    @Override
    public Seller selectById(Integer sellerId) {
        return this.sellerMapper.selectById(sellerId);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Seller> selectAll() {
        return this.sellerMapper.selectList(null);
    }

    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Seller> selectList(Seller seller) {
        return this.sellerMapper.selectList(null);
    }

    /**
     * 新增数据
     *
     * @param seller 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Seller seller) {
        return this.sellerMapper.insert(seller);
    }



    /**
     * 修改数据
     *
     * @param seller 实例对象
     * @return 实例对象
     */
    @Override
    public Seller update(Seller seller) {
        this.sellerMapper.update(seller,null);
        return this.selectById(seller.getSellerId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sellerId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer sellerId) {
        return this.sellerMapper.deleteById(sellerId);
    }

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    @Override
    public int count() {
        return this.sellerMapper.selectCount(null);
    }
}

