package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.common.Response;
import java.util.List;

import javax.annotation.Resource;

/**
 * (User)控制层
 *
 * @author leo
 * @since 2022-03-28 11:51:42
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param user 参数对象
     * @return 单条数据
     */
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Response selectOne(User user) {
        User result = userService.selectById(user.getUserId());
        if(result != null){
            Response.success();
        }
        return Response.error();
    }
    
    /**
     * 新增一条数据
     *
     * @param user 实体类
     * @return Response对象
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Response insert(@RequestBody User user) {
        int result = userService.insert(user);
        if (result > 0) {
            Response.success();
        }
        return Response.error();
    }

    /**
     * 修改一条数据
     *
     * @param user 实体类
     * @return Response对象
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public Response update(@RequestBody User user) {
        User result = userService.update(user);
        if (result != null) {
            Response.success(result);
        }
        return Response.error();
    }

    /**
     * 删除一条数据
     *
     * @param user 参数对象
     * @return Response对象
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public Response delete(User user) {
        int result = userService.deleteById(user.getUserId());
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
        List<User> users = userService.selectAll();
        if (users != null) {
            Response.success(users);
        }
        return Response.error();
    }
    
}
