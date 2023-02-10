package com.polizas.pruebaApiPersonalSoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

//significa que es una entidad de base de datos
@Entity
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPoliza;
    private String nombre;
    private Integer idCliente;
    private Date fechaNacimiento;
    private Date fechaPoliza;
    private String coberturaPoliza;
    private String nombrePlanPoliza;
    private String ciudadResidencia;
    private String direccionResidencia;
    private int modelo;
    private String placa;
}
