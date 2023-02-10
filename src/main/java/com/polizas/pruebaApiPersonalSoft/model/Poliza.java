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

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        this.idPoliza = idPoliza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaPoliza() {
        return fechaPoliza;
    }

    public void setFechaPoliza(Date fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public String getCoberturaPoliza() {
        return coberturaPoliza;
    }

    public void setCoberturaPoliza(String coberturaPoliza) {
        this.coberturaPoliza = coberturaPoliza;
    }

    public String getNombrePlanPoliza() {
        return nombrePlanPoliza;
    }

    public void setNombrePlanPoliza(String nombrePlanPoliza) {
        this.nombrePlanPoliza = nombrePlanPoliza;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
