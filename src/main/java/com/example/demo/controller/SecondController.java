package com.example.demo.controller;

import com.example.demo.common.Response;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 */
@RestController
@RequestMapping("/second")
public class SecondController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Response trySecond(){
        Boolean result = productService.second();
        if (!result){
            Response.error();
        }
        return Response.success();
    }
}
