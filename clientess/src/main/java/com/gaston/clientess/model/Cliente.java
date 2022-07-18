package com.gaston.clientess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name = "CLIENTE")

public class Cliente {

    @Id
    @Column (name = "idcliente")
    private Integer idcliente;
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "FECHANACIMIENTO")
    private Date fechanacimiento;

    @Column(name = "DNI")
    private Integer dni;


    //getters and setters

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechanacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechanacimiento = fechaNacimiento;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    //constructor

    public Cliente() {

    }

    public Cliente(Integer idcliente, String nombre, String apellido, Date fechanacimiento, Integer dni) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.dni = dni;
    }
}