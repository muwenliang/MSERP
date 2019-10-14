package com.jiubo.erp.service;

import com.jiubo.erp.entities.Product;
import com.jiubo.erp.service.impl.ProductClientServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// 指定调用的服务 MICROSERVICE-PRODUCT
// 未添加断路器配置 @FeignClient(value = "erpserviceone")
@FeignClient(value = "erpserviceone", fallback = ProductClientServiceFallBack.class)
public interface ProductClientService {
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(Product product);
}
