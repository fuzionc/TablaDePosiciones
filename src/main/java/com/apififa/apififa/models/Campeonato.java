package com.apififa.apififa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")
    private Integer id;

    @Column(name = "campeonato", length = 100)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion pais;

    @Column(name = "año")
    private int año;

    @JsonIgnore
    @OneToMany(mappedBy = "campeonato")
    private List<Grupo> grupos = new ArrayList<>();

    public Campeonato() {
    }

    public Campeonato(Integer id, String nombre, Seleccion pais, int año, List<Grupo> grupos) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.año = año;
        this.grupos = grupos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Seleccion getPais() {
        return pais;
    }

    public void setPais(Seleccion pais) {
        this.pais = pais;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
