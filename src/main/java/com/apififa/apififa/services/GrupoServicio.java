package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.IGrupoServicio;
import com.apififa.apififa.models.Campeonato;
import com.apififa.apififa.models.Grupo;
import com.apififa.apififa.repository.GrupoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServicio implements IGrupoServicio {

    private final GrupoRepositorio grupoRepositorio;


    public GrupoServicio(GrupoRepositorio grupoRepositorio) {
        this.grupoRepositorio = grupoRepositorio;
    }


    @Override
    public List<Grupo> listar() {
        return grupoRepositorio.findAll();
    }

    @Override
    public Optional<Grupo> obtener(Integer id) {
        Optional<Grupo> grupo = grupoRepositorio.findById(id);
        if (grupo.isEmpty()){
            return Optional.empty();
        }
        return grupo;
    }

    @Override
    public List<Grupo> buscar(String nombre) {
       return grupoRepositorio.findByNombre(nombre);
    }

    @Override
    public Grupo guardar(Grupo grupo) {
        return grupoRepositorio.save(grupo);
    }

    @Override
    public void eliminar(Integer id) {
    grupoRepositorio.deleteById(id);
    }
}
