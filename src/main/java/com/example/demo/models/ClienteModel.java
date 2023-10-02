package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCliente;

    private String nombre;
    private String Apellido;
    private String email;
    private Long telefono;
    private Integer cotizaciones;

    public Long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Long idCliente) {
        IdCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Integer getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(Integer cotizaciones) {
        this.cotizaciones = cotizaciones;
    }
}
