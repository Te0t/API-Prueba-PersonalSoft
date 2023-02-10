package com.polizas.pruebaApiPersonalSoft.service;

import com.polizas.pruebaApiPersonalSoft.model.Poliza;
import com.polizas.pruebaApiPersonalSoft.repository.PolizaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaService {

    @Autowired
    private PolizaRepository repository;
    public List<Poliza> listarPolizas(){
        return repository.findAll();
    }

    public void guardarPolizas(Poliza poliza){
        repository.save(poliza);
    }

    public Poliza obtenerPolizasPorId(Integer idPoliza){
        return repository.findById(idPoliza).get();
    }

    public void eliminarPolizas(Integer idPoliza){
        repository.deleteById(idPoliza);
    }

    public List<Poliza> ListAll(){
        return repository.findAll();
    }
}
