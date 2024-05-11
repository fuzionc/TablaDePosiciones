package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.ISeleccionServicio;
import com.apififa.apififa.models.Seleccion;
import com.apififa.apififa.repository.SeleccionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeleccionServicio implements ISeleccionServicio {

    private final SeleccionRepositorio seleccionRepositorio;

    public SeleccionServicio(SeleccionRepositorio seleccionRepositorio) {
        this.seleccionRepositorio = seleccionRepositorio;
    }

    @Override
    public List<Seleccion> listar() {
       return seleccionRepositorio.findAll();
    }
}
