/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.domain.services;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabrizio-PC
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAll(){
        return productRepository.getAll();
    }
    
    public Optional<Product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }
    public Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }
    public Product save(Product product){
        return productRepository.save(product);
    }
    public boolean Delete(int productId){
         return getProduct(productId).map(
                prod -> {
                    productRepository.Delete(productId);
                    return true;
                }).orElse(false);
    }
}
