package com.apififa.apififa.repository;

import com.apififa.apififa.models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GrupoRepositorio extends JpaRepository<Grupo, Integer> {

    //query method para buscar por nombre de torneo
    List<Grupo> findByNombre(String nombreGrupo);
}
