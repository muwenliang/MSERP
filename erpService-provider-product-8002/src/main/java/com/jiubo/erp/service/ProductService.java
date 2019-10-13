package com.jiubo.erp.service;
import com.jiubo.erp.entities.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
