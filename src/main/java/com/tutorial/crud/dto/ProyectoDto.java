
package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;


public class ProyectoDto {
    
    @NotBlank
    private String nombre_proyecto;
    @NotBlank
    private String fecha_proyecto;
    @NotBlank
    private String descripcion_proyecto;
    @NotBlank
    private String link_proyecto;
    @NotBlank
    private String imagen_proyecto;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre_proyecto, String fecha_proyecto, String descripcion_proyecto, String link_proyecto, String imagen_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
        this.fecha_proyecto = fecha_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.link_proyecto = link_proyecto;
        this.imagen_proyecto = imagen_proyecto;
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
