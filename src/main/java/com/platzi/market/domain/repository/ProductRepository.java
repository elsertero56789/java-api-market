/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Fabrizio-PC
 */
public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void Delete(int productId);
}
