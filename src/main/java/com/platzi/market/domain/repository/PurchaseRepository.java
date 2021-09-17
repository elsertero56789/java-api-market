/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.domain.repository;

import com.platzi.market.domain.Purchase;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Fabrizio-PC
 */
public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
    
}
