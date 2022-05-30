
package com.tutorial.crud.entity;

import javax.persistence.*;


@Entity
public class Experiencia {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_exp;
    
 
    private String empresa;
    private String puesto;
    private String pais;
    private String anio_ingreso_exp;
    private String anio_egreso_exp;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(int id_exp, String empresa, String puesto, String pais, String anio_ingreso_exp, String anio_egreso_exp, String descripcion) {
        this.id_exp = id_exp;
        this.empresa = empresa;
        this.puesto = puesto;
        this.pais = pais;
        this.anio_ingreso_exp = anio_ingreso_exp;
        this.anio_egreso_exp = anio_egreso_exp;
        this.descripcion = descripcion;
    }

    public Experiencia(String empresa, String puesto, String pais, String anio_ingreso_exp, String anio_egreso_exp, String descripcion) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.pais = pais;
        this.anio_ingreso_exp = anio_ingreso_exp;
        this.anio_egreso_exp = anio_egreso_exp;
        this.descripcion = descripcion;
    }

    public int getId_exp() {
        return id_exp;
    }

    public void setId_exp(int id_exp) {
        this.id_exp = id_exp;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAnio_ingreso_exp() {
        return anio_ingreso_exp;
    }

    public void setAnio_ingreso_exp(String anio_ingreso_exp) {
        this.anio_ingreso_exp = anio_ingreso_exp;
    }

    public String getAnio_egreso_exp() {
        return anio_egreso_exp;
    }

    public void setAnio_egreso_exp(String anio_egreso_exp) {
        this.anio_egreso_exp = anio_egreso_exp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
