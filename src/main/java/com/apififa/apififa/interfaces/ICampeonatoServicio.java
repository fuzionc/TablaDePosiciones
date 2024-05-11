package com.apififa.apififa.interfaces;

import com.apififa.apififa.models.Campeonato;

import java.util.List;
import java.util.Optional;

public interface ICampeonatoServicio {

    List<Campeonato> listar();

    Optional<Campeonato> obtener(Integer id);

    List<Campeonato> buscar(String nombre);

    Campeonato guardar(Campeonato Empresa);

    void eliminar(Integer id);
}
