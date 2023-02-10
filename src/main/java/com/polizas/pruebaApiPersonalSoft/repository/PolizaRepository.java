package com.polizas.pruebaApiPersonalSoft.repository;

import com.polizas.pruebaApiPersonalSoft.model.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizaRepository extends JpaRepository<Poliza, Integer> {
}
