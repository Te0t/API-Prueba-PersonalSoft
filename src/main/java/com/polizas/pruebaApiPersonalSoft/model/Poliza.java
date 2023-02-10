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

    public Poliza(Integer idPoliza, String nombre, Integer idCliente, Date fechaNacimiento, Date fechaPoliza, String coberturaPoliza, String nombrePlanPoliza, String ciudadResidencia, String direccionResidencia, int modelo, String placa) {
        this.idPoliza = idPoliza;
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaPoliza = fechaPoliza;
        this.coberturaPoliza = coberturaPoliza;
        this.nombrePlanPoliza = nombrePlanPoliza;
        this.ciudadResidencia = ciudadResidencia;
        this.direccionResidencia = direccionResidencia;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Poliza(String nombre, Integer idCliente, Date fechaNacimiento, Date fechaPoliza, String coberturaPoliza, String nombrePlanPoliza, String ciudadResidencia, String direccionResidencia, int modelo, String placa) {

        this.nombre = nombre;
        this.idCliente = idCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaPoliza = fechaPoliza;
        this.coberturaPoliza = coberturaPoliza;
        this.nombrePlanPoliza = nombrePlanPoliza;
        this.ciudadResidencia = ciudadResidencia;
        this.direccionResidencia = direccionResidencia;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Poliza() {
        super();
    }
}
