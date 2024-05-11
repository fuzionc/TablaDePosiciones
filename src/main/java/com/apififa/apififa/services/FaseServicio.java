package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.IFaseServicio;
import com.apififa.apififa.models.Fase;
import com.apififa.apififa.repository.FaseRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaseServicio implements IFaseServicio {

    private final FaseRepositorio faseRepositorio;

    public FaseServicio(FaseRepositorio faseRepositorio) {
        this.faseRepositorio = faseRepositorio;
    }

    @Override
    public List<Fase> listar() {
        return faseRepositorio.findAll();
    }
}
