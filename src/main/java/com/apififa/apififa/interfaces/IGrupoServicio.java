package com.apififa.apififa.interfaces;

import com.apififa.apififa.models.Grupo;

import java.util.List;
import java.util.Optional;

public interface IGrupoServicio {

    List<Grupo> listar();

    Optional<Grupo> obtener(Integer id);

    List<Grupo> buscar(String nombre);

    Grupo guardar(Grupo grupo);

    void eliminar(Integer id);
}
