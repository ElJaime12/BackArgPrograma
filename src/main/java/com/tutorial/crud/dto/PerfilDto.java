
package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;


public class PerfilDto {
    
    @NotBlank
    private String nombre_perfil;
    @NotBlank
    private String apellido_perfil;
    @NotBlank
    private String email_perfil;
    @NotBlank
    private String ocupacion_perfil;
    @NotBlank
    private String telefono_perfil;
    @NotBlank
    private String url_perfil;
    @NotBlank
    private String url_banner;
    @NotBlank
    private String acerca_de;

    public PerfilDto() {
    }

    public PerfilDto(String nombre_perfil, String apellido_perfil, String email_perfil, String ocupacion_perfil, String telefono_perfil, String url_perfil, String url_banner, String acerca_de) {
        this.nombre_perfil = nombre_perfil;
        this.apellido_perfil = apellido_perfil;
        this.email_perfil = email_perfil;
        this.ocupacion_perfil = ocupacion_perfil;
        this.telefono_perfil = telefono_perfil;
        this.url_perfil = url_perfil;
        this.url_banner = url_banner;
        this.acerca_de = acerca_de;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public String getApellido_perfil() {
        return apellido_perfil;
    }

    public void setApellido_perfil(String apellido_perfil) {
        this.apellido_perfil = apellido_perfil;
    }

    public String getEmail_perfil() {
        return email_perfil;
    }

    public void setEmail_perfil(String email_perfil) {
        this.email_perfil = email_perfil;
    }

    public String getOcupacion_perfil() {
        return ocupacion_perfil;
    }

    public void setOcupacion_perfil(String ocupacion_perfil) {
        this.ocupacion_perfil = ocupacion_perfil;
    }

    public String getTelefono_perfil() {
        return telefono_perfil;
    }

    public void setTelefono_perfil(String telefono_perfil) {
        this.telefono_perfil = telefono_perfil;
    }

    public String getUrl_perfil() {
        return url_perfil;
    }

    public void setUrl_perfil(String url_perfil) {
        this.url_perfil = url_perfil;
    }

    public String getUrl_banner() {
        return url_banner;
    }

    public void setUrl_banner(String url_banner) {
        this.url_banner = url_banner;
    }
    
    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }
    
}
