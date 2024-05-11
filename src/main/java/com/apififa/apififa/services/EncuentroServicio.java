package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.IEncuentroServicio;
import com.apififa.apififa.models.Encuentro;
import com.apififa.apififa.repository.EncuentroRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EncuentroServicio implements IEncuentroServicio {

    private final EncuentroRepositorio encuentroRepositorio;

    public EncuentroServicio(EncuentroRepositorio encuentroRepositorio) {
        this.encuentroRepositorio = encuentroRepositorio;
    }

    @Override
    public List<Encuentro> listar() {
        return encuentroRepositorio.findAll();
    }

    @Override
    public Optional<Encuentro> obtener(Integer id) {
        Optional<Encuentro> encuentro = encuentroRepositorio.findById(id);
        if (encuentro.isEmpty()) {
            return Optional.empty();
        }
        return encuentro;
    }

    @Override
    public List<Object[]> getEncuentrosPorFecha(LocalDate fecha) {
        return encuentroRepositorio.getEncuentrosPorFecha(fecha);
    }


    @Override
    public Encuentro guardar(Encuentro encuentro) {
       return encuentroRepositorio.save(encuentro);
    }

    @Override
    public void eliminar(Integer id) {
        encuentroRepositorio.deleteById(id);
    }

    @Override
    public List<Object[]> getEncuentros() {
       return encuentroRepositorio.getEncuentros();
    }



}
