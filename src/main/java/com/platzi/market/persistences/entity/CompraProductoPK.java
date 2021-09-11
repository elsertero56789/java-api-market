/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistences.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Fabrizio-PC
 */
@Embeddable
public class CompraProductoPK {
    @Column(name = "id_compra")
    private Compra compra;
    
    @Column(name = "id_producto")
    private Producto producto;

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
