
package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proy;
    
 
    private String nombre_proyecto;
    private String fecha_proyecto;
    private String descripcion_proyecto;
    private String link_proyecto;
    private String imagen_proyecto;

    public Proyecto() {
    }

    public Proyecto(int id_proy, String nombre_proyecto, String fecha_proyecto, String descripcion_proyecto, String link_proyecto, String imagen_proyecto) {
        this.id_proy = id_proy;
        this.nombre_proyecto = nombre_proyecto;
        this.fecha_proyecto = fecha_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.link_proyecto = link_proyecto;
        this.imagen_proyecto = imagen_proyecto;
    }

    public Proyecto(String nombre_proyecto, String fecha_proyecto, String descripcion_proyecto, String link_proyecto, String imagen_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
        this.fecha_proyecto = fecha_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.link_proyecto = link_proyecto;
        this.imagen_proyecto = imagen_proyecto;
    }

    public int getId_proy() {
        return id_proy;
    }

    public void setId_proy(int id_proy) {
        this.id_proy = id_proy;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getFecha_proyecto() {
        return fecha_proyecto;
    }

    public void setFecha_proyecto(String fecha_proyecto) {
        this.fecha_proyecto = fecha_proyecto;
    }

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }

    public String getLink_proyecto() {
        return link_proyecto;
    }

    public void setLink_proyecto(String link_proyecto) {
        this.link_proyecto = link_proyecto;
    }

    public String getImagen_proyecto() {
        return imagen_proyecto;
    }

    public void setImagen_proyecto(String imagen_proyecto) {
        this.imagen_proyecto = imagen_proyecto;
    }
    
    
    
  
}
