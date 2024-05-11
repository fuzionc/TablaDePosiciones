package com.apififa.apififa.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Table(name = "encuentro")
public class Encuentro {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_encuentro")
    @GenericGenerator(name = "secuencia_encuentro", strategy = "increment")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idpais1", referencedColumnName = "id")
    private Seleccion paisUno;

    @ManyToOne
    @JoinColumn(name = "idpais2", referencedColumnName = "id")
    private Seleccion paisDos;

    @ManyToOne
    @JoinColumn(name = "idfase", referencedColumnName = "id")
    private Fase fase;


    @ManyToOne
    @JoinColumn(name = "idcampeonato",referencedColumnName = "id")
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(name = "idestadio",referencedColumnName = "id")
    private Estadio estadio;

    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "goles1")
    private Integer golesUno;
    @Column(name = "goles2")
    private Integer golesDos;


    public Encuentro() {
    }

    public Encuentro(Integer id, Seleccion paisUno, Seleccion paisDos, Fase fase, Campeonato campeonato, Estadio estadio, LocalDate fecha, Integer golesUno, Integer golesDos) {
        this.id = id;
        this.paisUno = paisUno;
        this.paisDos = paisDos;
        this.fase = fase;
        this.campeonato = campeonato;
        this.estadio = estadio;
        this.fecha = fecha;
        this.golesUno = golesUno;
        this.golesDos = golesDos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Seleccion getPaisUno() {
        return paisUno;
    }

    public void setPaisUno(Seleccion paisUno) {
        this.paisUno = paisUno;
    }

    public Seleccion getPaisDos() {
        return paisDos;
    }

    public void setPaisDos(Seleccion paisDos) {
        this.paisDos = paisDos;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getGolesUno() {
        return golesUno;
    }

    public void setGolesUno(Integer golesUno) {
        this.golesUno = golesUno;
    }

    public Integer getGolesDos() {
        return golesDos;
    }

    public void setGolesDos(Integer golesDos) {
        this.golesDos = golesDos;
    }
}
