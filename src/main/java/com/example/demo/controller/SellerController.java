package com.example.demo.controller;

import com.example.demo.entity.Seller;
import com.example.demo.service.SellerService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.common.Response;
import java.util.List;

import javax.annotation.Resource;

/**
 * (Seller)控制层
 *
 * @author leo
 * @since 2022-03-28 11:51:42
 */
@RestController
@RequestMapping("/seller")
public class SellerController {
    /**
     * 服务对象
     */
    @Resource
    private SellerService sellerService;

    /**
     * 通过主键查询单条数据
     *
     * @param seller 参数对象
     * @return 单条数据
     */
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Response selectOne(Seller seller) {
        Seller result = sellerService.selectById(seller.getSellerId());
        if(result != null){
            Response.success();
        }
        return Response.error();
    }
    
    /**
     * 新增一条数据
     *
     * @param seller 实体类
     * @return Response对象
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Response insert(@RequestBody Seller seller) {
        int result = sellerService.insert(seller);
        if (result > 0) {
            Response.success();
        }
        return Response.error();
    }

    /**
     * 修改一条数据
     *
     * @param seller 实体类
     * @return Response对象
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public Response update(@RequestBody Seller seller) {
        Seller result = sellerService.update(seller);
        if (result != null) {
            Response.success(result);
        }
        return Response.error();
    }

    /**
     * 删除一条数据
     *
     * @param seller 参数对象
     * @return Response对象
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public Response delete(Seller seller) {
        int result = sellerService.deleteById(seller.getSellerId());
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
        List<Seller> sellers = sellerService.selectAll();
        if (sellers != null) {
            Response.success(sellers);
        }
        return Response.error();
    }

    
}
