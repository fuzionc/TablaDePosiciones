package com.apififa.apififa.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_grupo")
    @GenericGenerator(name = "secuencia_grupo", strategy = "increment")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
    private Campeonato campeonato;

    @Column(name = "grupo", length = 5)
    private String nombre;


    public Grupo() {
    }

    public Grupo(int id, Campeonato campeonato, String nombre) {
        this.id = id;
        this.campeonato = campeonato;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
