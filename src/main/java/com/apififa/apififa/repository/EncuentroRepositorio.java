package com.apififa.apififa.repository;

import com.apififa.apififa.models.Encuentro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EncuentroRepositorio extends JpaRepository<Encuentro, Integer> {

//    SELECT pais1.pais AS pais1, pais2.pais AS pais2, fecha, goles1, goles2
//    FROM public.encuentro
//    INNER JOIN public.pais AS pais1 ON encuentro.idpais1 = pais1.id
//    INNER JOIN public.pais AS pais2 ON encuentro.idpais2 = pais2.id;

    @Query("SELECT e.id,e.paisUno.nombre AS pais1, e.paisDos.nombre AS pais2, e.fecha, e.golesUno, e.golesDos " +
            "FROM Encuentro e " +
            "INNER JOIN e.paisUno pais1 " +
            "INNER JOIN e.paisDos pais2")
    List<Object[]> getEncuentros();


    @Query("SELECT e.paisUno.nombre AS pais1, e.paisDos.nombre AS pais2, e.fecha, e.golesUno, e.golesDos " +
            "FROM Encuentro e " +
            "INNER JOIN e.paisUno pais1 " +
            "INNER JOIN e.paisDos pais2 " +
            "WHERE e.fecha = ?1"
    )
    List<Object[]> getEncuentrosPorFecha(LocalDate fecha);

}

// paisUno: Seleccion;
//         paisDos:Seleccion,
//         fecha: Date,
//         golesUno:number,
//         golesDOs:number,
//         encabezado: string;
//         campeonato: Campeonato;
//         paises: Seleccion[];