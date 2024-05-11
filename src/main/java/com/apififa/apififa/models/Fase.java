package com.apififa.apififa.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "fase")
public class Fase {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_fase")
    @GenericGenerator(name = "secuencia_fase", strategy = "increment")
    private Integer id;

    @Column(name = "fase")
    private String fase;

    public Fase() {
    }

    public Fase(Integer id, String fase) {
        this.id = id;
        this.fase = fase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
}
