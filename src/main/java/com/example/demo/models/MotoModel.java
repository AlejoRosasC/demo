package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "moto")
public class MotoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMoto;

    private String marca;
    private String modelo;
    private Integer anno;
    private Integer precio;

    public Long getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(Long idMoto) {
        this.idMoto = idMoto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
