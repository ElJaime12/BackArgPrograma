
package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;


public class SkillDto {
    
    @NotBlank
    private String habilidad;
    @NotBlank
    private Integer porcentaje;

    public SkillDto() {
    }

    public SkillDto(String habilidad, Integer porcentaje) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }
  
    
    
}
