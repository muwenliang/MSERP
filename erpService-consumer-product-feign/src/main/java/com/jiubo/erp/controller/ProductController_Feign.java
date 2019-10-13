package com.jiubo.erp.controller;

import com.jiubo.erp.entities.Product;
import com.jiubo.erp.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController_Feign {


    @Autowired
    private ProductClientService service;


    // SpringCloud对Feign进行了增强兼容了SpringMVC的注解 ，我们在使用SpringMVC的注解时需要注意:
    // 1、@FeignClient接口方法有基本类型参数在参数必须加@PathVariable("XXX") 或 @RequestParam("XXX")
    // 2、@FeignClient接口方法返回值为复杂对象时，此类型必须有无参构造方法

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }
    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }
    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }
}
