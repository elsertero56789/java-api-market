/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistences.mapper;

import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistences.entity.CompraProductos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author Fabrizio-PC
 */
@Mapper(componentModel = "spring", uses = ProductMapper.class)
public interface PurchaseItemMapper {
    @Mappings({
        @Mapping(source = "id.producto", target = "productId"),
        @Mapping(source = "cantidad", target = "quantity"),
        @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(CompraProductos producto);
    
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "compra", ignore = true),
        @Mapping(target = "producto", ignore = true),
        @Mapping(target = "id.compra", ignore = true)
    })
    CompraProductos toComprasProducto(PurchaseItem item);
}
