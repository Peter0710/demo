package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.common.Response;
import java.util.List;

import javax.annotation.Resource;

/**
 * (Product)控制层
 *
 * @author leo
 * @since 2022-03-28 11:51:42
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param product 参数对象
     * @return 单条数据
     */
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Response selectOne(Product product) {
        Product result = productService.selectById(product.getProductId());
        if(result != null){
            Response.success();
        }
        return Response.error();
    }
    
    /**
     * 新增一条数据
     *
     * @param product 实体类
     * @return Response对象
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Response insert(@RequestBody Product product) {
        int result = productService.insert(product);
        if (result > 0) {
            Response.success();
        }
        return Response.error();
    }

    /**
     * 修改一条数据
     *
     * @param product 实体类
     * @return Response对象
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public Response update(@RequestBody Product product) {
        Product result = productService.update(product);
        if (result != null) {
            Response.success(result);
        }
        return Response.error();
    }

    /**
     * 删除一条数据
     *
     * @param product 参数对象
     * @return Response对象
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public Response delete(Product product) {
        int result = productService.deleteById(product.getProductId());
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
        List<Product> products = productService.selectAll();
        if (products != null) {
            Response.success(products);
        }
        return Response.error();
    }
    
}
