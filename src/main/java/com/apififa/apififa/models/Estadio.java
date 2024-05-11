package com.apififa.apififa.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="estadio")
public class Estadio {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_estadio")
    @GenericGenerator(name = "secuencia_estadio", strategy = "increment")
    private Integer id;
    @Column(name="estadio")
    private String estadio;

    public Estadio() {
    }

    public Estadio(Integer id, String estadio) {
        this.id = id;
        this.estadio = estadio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
