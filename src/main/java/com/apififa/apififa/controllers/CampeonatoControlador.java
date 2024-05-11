package com.apififa.apififa.controllers;

import com.apififa.apififa.interfaces.ICampeonatoServicio;
import com.apififa.apififa.models.Campeonato;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoControlador {

    private final ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listar")
    public List<Campeonato> listar() {
        return servicio.listar();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/grupos/{id}")
    public Optional<Campeonato> listarGrupos(@PathVariable int id) {
        return servicio.obtener(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/buscar/{nombre}")
    public List<Campeonato> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/crear")
    public Campeonato crear(@RequestBody Campeonato campeonato) {
        return servicio.guardar(campeonato);

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/modificar")
    public Campeonato modificar(@RequestBody Campeonato campeonato){
        if (servicio.obtener(campeonato.getId()) != null){
            return servicio.guardar(campeonato);
        }else {
            return null;
        }

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Map<String,String>> eliminarCampeonato(@PathVariable Integer id) {

        servicio.eliminar(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Elemento eliminado");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
