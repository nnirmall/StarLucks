package com.nnirmall.product_service.service;

import com.nnirmall.product_service.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Product product, Integer id);
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    boolean deleteProduct(Integer id);


}
