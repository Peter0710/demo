package com.example.demo.service.impl;

import com.example.demo.dao.ProductMapper;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * (Product表)服务实现类
 *
 * @author leo
 * @since 2022-03-28 10:53:00
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    @Override
    public Product selectById(Integer productId) {
        return this.productMapper.selectById(productId);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Product> selectAll() {
        return this.productMapper.selectList(null);
    }

    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Product> selectList(Product product) {
        return this.productMapper.selectList(null);
    }

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Product product) {
        return this.productMapper.insert(product);
    }


    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product update(Product product) {
        this.productMapper.update(product, null);
        return this.selectById(product.getProductId());
    }

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer productId) {
        return this.productMapper.deleteById(productId);
    }

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    @Override
    public int count() {
        return this.productMapper.selectCount(null);
    }

    @Override
    public Boolean second() {
        ArrayList<Optional<Object>> objects = new ArrayList<>();
        objects.get(0).ifPresent(o -> System.out.println("123"));
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf();
        HashMap<String, String> map = new HashMap<>();
        //123
        return true;
    }
}

