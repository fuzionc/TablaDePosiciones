package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.IEstadioService;
import com.apififa.apififa.models.Estadio;
import com.apififa.apififa.repository.EstadioRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstadioServicio implements IEstadioService {
    private final EstadioRepositorio estadioRepositorio;

    public EstadioServicio(EstadioRepositorio estadioRepositorio) {
        this.estadioRepositorio = estadioRepositorio;
    }

    @Override
    public List<Estadio> listar() {
        return estadioRepositorio.findAll();
    }
}
