package com.gaston.clientess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name ="COMPROBANTE")
public class Comprobante {

    @Id
    @Column (name = "idcomprobante")
    private Integer idcomprobante;

    @Column (name= "cantidad")
    private int cantidad;

    @Column (name = "fecha")
    private Date fecha;

    @Column (name = "total")
    private Float total;


    //getters and setters


    public Integer getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(Integer idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    //constructor

    public Comprobante() {
    }

    public Comprobante(Integer idcomprobante, int cantidad, Date fecha, Float total) {
        this.idcomprobante = idcomprobante;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }
}

