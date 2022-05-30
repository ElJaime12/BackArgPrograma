
package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_skills;
    
 
    private String habilidad;
    private Integer porcentaje;

    public Skill() {
    }

    public Skill(int id_skills, String habilidad, Integer porcentaje) {
        this.id_skills = id_skills;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public Skill(String habilidad, Integer porcentaje) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public int getId_skills() {
        return id_skills;
    }

    public void setId_skills(int id_skills) {
        this.id_skills = id_skills;
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
