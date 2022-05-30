
package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;


public class ExperienciaDto {
    
    @NotBlank
    private String empresa;
    @NotBlank
    private String puesto;
    @NotBlank
    private String pais;
    @NotBlank
    private String anio_ingreso_exp;
    @NotBlank
    private String anio_egreso_exp;
    @NotBlank
    private String descripcion;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String empresa, String puesto, String pais, String anio_ingreso_exp, String anio_egreso_exp, String descripcion) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.pais = pais;
        this.anio_ingreso_exp = anio_ingreso_exp;
        this.anio_egreso_exp = anio_egreso_exp;
        this.descripcion = descripcion;
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
