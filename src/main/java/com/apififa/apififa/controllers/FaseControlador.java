package com.apififa.apififa.controllers;

import com.apififa.apififa.interfaces.IFaseServicio;
import com.apififa.apififa.models.Fase;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fases")
public class FaseControlador {

    private final IFaseServicio iFaseServicio;

    public FaseControlador(IFaseServicio iFaseServicio) {
        this.iFaseServicio = iFaseServicio;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listar")
    public List<Fase> listarFases(){
        return iFaseServicio.listar();
    }
}
