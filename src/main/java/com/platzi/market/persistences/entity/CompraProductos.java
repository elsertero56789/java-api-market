/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistences.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 *
 * @author Fabrizio-PC
 */
@Entity
@Table(name = "compras_productos")
public class CompraProductos implements Serializable {
   
    @EmbeddedId
    private  CompraProductoPK id;
    
    @Column(name = "cantidad", nullable = true)
    private Integer cantidad;
    
    @Column(name = "total", nullable = true, precision = 16, scale = 2)
    private BigDecimal total;
    
    @Column(name = "estado", nullable = true)
    private Boolean estado;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
    
}