package com.apififa.apififa.repository;

import com.apififa.apififa.models.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {

//query method para buscar por nombre
    List<Campeonato> findByNombre(String nombreCampeonato);
}
