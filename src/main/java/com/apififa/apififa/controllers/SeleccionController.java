package com.apififa.apififa.controllers;

import com.apififa.apififa.interfaces.ISeleccionServicio;
import com.apififa.apififa.models.Grupo;
import com.apififa.apififa.models.Seleccion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class SeleccionController {
    private final ISeleccionServicio seleccionServicio;

    public SeleccionController(ISeleccionServicio seleccionServicio) {
        this.seleccionServicio = seleccionServicio;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listar")
    public List<Seleccion> listar() {
        return seleccionServicio.listar();
    }
}
