package com.apififa.apififa.repository;

import com.apififa.apififa.models.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepositorio extends JpaRepository<Estadio, Integer> {
}
