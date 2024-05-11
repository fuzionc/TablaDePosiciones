package com.apififa.apififa.repository;

import com.apififa.apififa.models.Fase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaseRepositorio extends JpaRepository<Fase,Integer> {
}
