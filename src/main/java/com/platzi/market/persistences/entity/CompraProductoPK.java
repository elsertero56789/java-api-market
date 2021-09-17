/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistences.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Fabrizio-PC
 */
@Embeddable
public class CompraProductoPK implements Serializable{
    @Column(name = "id_compra")
    private Integer compra;
    
    @Column(name = "id_producto")
    private Integer producto;

    public Integer getCompra() {
        return compra;
    }

    public void setCompra(Integer compra) {
        this.compra = compra;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    
    
}
