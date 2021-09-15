/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistences.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistences.entity.Producto;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author Fabrizio-PC
 */
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
        @Mapping(source = "idProducto", target = "productId"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "precioVenta", target = "price"),
        @Mapping(source = "cantidadStock", target = "stock" ),
        @Mapping(source = "estado", target = "active" ),
        @Mapping(source = "categoria", target = "category" )
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);
    
    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true )
    Producto toProducto(Product product);
}
