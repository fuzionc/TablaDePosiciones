package com.apififa.apififa.controllers;

import com.apififa.apififa.interfaces.IEstadioService;
import com.apififa.apififa.models.Estadio;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadios")
public class EstadioController {
    private final IEstadioService iEstadioService;

    public EstadioController(IEstadioService iEstadioService) {
        this.iEstadioService = iEstadioService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listar")
    public List<Estadio> listarEstadios(){
       return iEstadioService.listar();
    }
}
