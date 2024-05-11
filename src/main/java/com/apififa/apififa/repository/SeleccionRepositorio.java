package com.apififa.apififa.repository;

import com.apififa.apififa.models.Seleccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SeleccionRepositorio extends JpaRepository<Seleccion, Integer> {

}
