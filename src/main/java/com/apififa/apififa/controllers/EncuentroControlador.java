package com.apififa.apififa.controllers;

import com.apififa.apififa.interfaces.IEncuentroServicio;
import com.apififa.apififa.models.Encuentro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/encuentros")
public class EncuentroControlador {

    private final IEncuentroServicio encuentroServicio;

    public EncuentroControlador(IEncuentroServicio encuentroServicio) {
        this.encuentroServicio = encuentroServicio;
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/listar")
    public List<Encuentro> listar() {
        return encuentroServicio.listar();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/encuentro/{id}")
    public Optional<Encuentro> listarGrupos(@PathVariable Integer id) {
        return encuentroServicio.obtener(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/buscar/{fecha}")
    public List<Object[]> buscarPartidoPorFecha(@PathVariable LocalDate fecha){
        return encuentroServicio.getEncuentrosPorFecha(fecha);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/crear")
    public Encuentro crear(@RequestBody Encuentro encuentro) {
        return encuentroServicio.guardar(encuentro);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/modificar")
    public Encuentro modificar(@RequestBody Encuentro encuentro) {
        if (encuentroServicio.obtener(encuentro.getId()) != null) {
            return encuentroServicio.guardar(encuentro);
        } else {
            return null;
        }

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Map<String,String>> eliminarCampeonato(@PathVariable Integer id) {

        encuentroServicio.eliminar(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Elemento eliminado");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/partidos")
    public List<Object[]> getEncuentros() {
        return encuentroServicio.getEncuentros();
    }
}
