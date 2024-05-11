package com.apififa.apififa.controllers;


import com.apififa.apififa.models.TablaDePosiciones;
import com.apififa.apififa.services.TablaDePosicionesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class TablaDePosicionController {


    private final TablaDePosicionesServicio tablaDePosicionesServicio;

    public TablaDePosicionController(TablaDePosicionesServicio tablaDePosicionesServicio) {
        this.tablaDePosicionesServicio = tablaDePosicionesServicio;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{idGrupo}/posiciones")

    public List<TablaDePosiciones> listarEquipos(@PathVariable int idGrupo) {
        return tablaDePosicionesServicio.listarPosiciones(idGrupo);
    }
}
