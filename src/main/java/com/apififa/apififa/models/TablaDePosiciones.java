package com.apififa.apififa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TablaDePosiciones {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "pais")
    private String pais;

    @Column(name = "pj")
    private int pj;
    @Column(name = "pg")
    private int pg;
    @Column(name = "pe")
    private int pe;
    @Column(name = "pp")
    private int pp;
    @Column(name = "gf")
    private int gf;
    @Column(name = "gc")
    private int gc;
    @Column(name = "puntos")
    private int puntos;

    public TablaDePosiciones() {
    }

    public TablaDePosiciones(int id, String pais, int pj, int pg, int pe, int pp, int gf, int gc, int puntos) {
        this.id = id;
        this.pais = pais;
        this.pj = pj;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.puntos = puntos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}

