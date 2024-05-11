package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.ICampeonatoServicio;
import com.apififa.apififa.models.Campeonato;
import com.apififa.apififa.repository.CampeonatoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CampeonatoServicio implements ICampeonatoServicio {

    private final CampeonatoRepositorio repositorio;

    public CampeonatoServicio(CampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Campeonato> obtener(Integer id) {
        Optional<Campeonato> campeonato = repositorio.findById(id);
        if (campeonato.isEmpty()){
            return Optional.empty();
        }
        return campeonato;
    }

    @Override
    public List<Campeonato> buscar(String nombre) {
       return repositorio.findByNombre(nombre);
    }

    @Override
    public Campeonato guardar(Campeonato campeonato) {
            return repositorio.save(campeonato);
    }

    @Override
    public void eliminar(Integer id) {

        repositorio.deleteById(id);
    }
}
