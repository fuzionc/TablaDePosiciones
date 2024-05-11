package com.apififa.apififa.interfaces;

import com.apififa.apififa.models.Campeonato;
import com.apififa.apififa.models.Encuentro;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IEncuentroServicio {

    List<Encuentro> listar();

    Optional<Encuentro> obtener(Integer id);


    Encuentro guardar(Encuentro encuentro);


    void eliminar(Integer id);

    List<Object[]> getEncuentros();
    List<Object[]> getEncuentrosPorFecha(LocalDate fecha);

}
