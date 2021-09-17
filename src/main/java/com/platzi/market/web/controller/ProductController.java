/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.web.controller;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.services.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fabrizio-PC
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{productId}")
    public Optional<Product> getProduct(@PathVariable int productId){
        return productService.getProduct(productId);
    }
    @PostMapping("/save")
    public Product save( @RequestBody Product product){
        return productService.save(product);
    }
    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getByCategory( @PathVariable int categoryId){
        return productService.getByCategory(categoryId);
    }
    @DeleteMapping("delete/{id}")
    public boolean Delete( @PathVariable("id") int productId){
            return productService.Delete(productId);
    }
}
