package com.apififa.apififa.controllers;

import com.apififa.apififa.interfaces.IGrupoServicio;
import com.apififa.apififa.models.Grupo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/Grupos")
public class GrupoControlador {
    private final IGrupoServicio grupoServicio;

    public GrupoControlador(IGrupoServicio grupoServicio) {
        this.grupoServicio = grupoServicio;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listar")
    public List<Grupo> listar() {
        return grupoServicio.listar();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/grupo/{id}")
    public Optional<Grupo> listarGrupos(@PathVariable Integer id) {
        return grupoServicio.obtener(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/buscar/{nombre}")
    public List<Grupo> buscar(@PathVariable String nombre) {
        return grupoServicio.buscar(nombre.toUpperCase());

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/crear")
    public Grupo crear(@RequestBody Grupo grupo) {
        return grupoServicio.guardar(grupo);

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/modificar")
    public Grupo modificar(@RequestBody Grupo grupo) {
        if (grupoServicio.obtener(grupo.getId()) != null) {
            return grupoServicio.guardar(grupo);
        } else {
            return null;
        }

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Map<String,String>> eliminarCampeonato(@PathVariable Integer id) {

        grupoServicio.eliminar(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Elemento eliminado");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
