package com.nnirmall.product_service.service;

import com.nnirmall.product_service.entity.Product;
import com.nnirmall.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        product.setCreatedAt(Instant.now());
        product.setUpdatedAt(Instant.now());
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product existingProduct = productRepository.findById(id).orElse(null);

        if(existingProduct != null){
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
//            existingProduct.setCreatedAt(product.getCreatedAt());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setStock(product.getStock());
            existingProduct.setUpdatedAt(Instant.now());
            return productRepository.save(existingProduct);
        }
        else
            return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {

        return productRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteProduct(Integer id) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if(existingProduct != null){
            return true;
        }
        else
            return false;
    }
}
