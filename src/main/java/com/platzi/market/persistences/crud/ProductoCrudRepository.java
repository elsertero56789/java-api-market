/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistences.crud;

import com.platzi.market.domain.Product;
import com.platzi.market.persistences.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fabrizio-PC
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
     
    //@Query( value = "select *from productos where id_categoria=?", nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);
    
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado (int cantidadStock, boolean estado);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
}
