package com.gaston.clientess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PRODUCTO")
public class Producto {

    @Column(name ="idproducto")
    @Id
    private Integer idproducto;

    @Column(name ="descripcion")
    private String descripcion;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "stock")
    private int stock;

    @Column(name = "codigo")
    private String codigo;


    //getters and setters


    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //constructor

    public Producto() {
    }

    public Producto(Integer idproducto, String descripcion, Float precio, int stock, String codigo) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }
}

