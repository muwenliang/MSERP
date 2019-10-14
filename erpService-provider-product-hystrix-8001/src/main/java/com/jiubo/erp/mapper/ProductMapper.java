package com.jiubo.erp.mapper;

import com.jiubo.erp.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 或在主启动类上使用@MapperScan注解
//@Mapper
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}

