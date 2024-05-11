package com.apififa.apififa.services;

import com.apififa.apififa.interfaces.ITablaDePosicionesServicio;
import com.apififa.apififa.models.TablaDePosiciones;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablaDePosicionesServicio implements ITablaDePosicionesServicio {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public List<TablaDePosiciones> listarPosiciones(int idGrupo) {
        String sql = "SELECT * FROM ftablaposicionesgrupo(:idGrupoTabla)";

        return entityManager
                .createNativeQuery(sql, TablaDePosiciones.class)
                .setParameter("idGrupoTabla", idGrupo)
                .getResultList();
    }
}
