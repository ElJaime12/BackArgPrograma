
package com.tutorial.crud.controller;

import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.PerfilDto;
import com.tutorial.crud.entity.Perfil;
import com.tutorial.crud.service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/perfil")
@CrossOrigin(origins = "http://localhost:4200")
public class PerfilController {
    
     @Autowired
    PerfilService perfilService;
     
     @GetMapping("/lista")
    public ResponseEntity<List<Perfil>> list(){
        List<Perfil> list = perfilService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id_perf}")
    public ResponseEntity<Perfil> getById(@PathVariable("id_perf") int id_perf){
        if(!perfilService.existsById(id_perf))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Perfil perfil = perfilService.getOne(id_perf).get();
        return new ResponseEntity(perfil, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody PerfilDto perfilDto){    
        Perfil perfil = new Perfil();
        perfil.setNombre_perfil(perfilDto.getNombre_perfil());
        perfil.setApellido_perfil(perfilDto.getApellido_perfil());
        perfil.setEmail_perfil(perfilDto.getEmail_perfil());
        perfil.setOcupacion_perfil(perfilDto.getOcupacion_perfil());
        perfil.setTelefono_perfil(perfilDto.getTelefono_perfil());
        perfil.setUrl_perfil(perfilDto.getUrl_perfil());
        perfil.setUrl_banner(perfilDto.getUrl_banner());
        perfil.setAcerca_de(perfilDto.getAcerca_de());
        perfilService.save(perfil);
        return new ResponseEntity(new Mensaje("El producto fue creado"), HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id_perf}")
    public ResponseEntity<?> update(@PathVariable("id_perf")int id_perf, @RequestBody PerfilDto perfilDto){
        
        Perfil perfil = perfilService.getOne(id_perf).get();
        perfil.setNombre_perfil(perfilDto.getNombre_perfil());
        perfil.setApellido_perfil(perfilDto.getApellido_perfil());
        perfil.setEmail_perfil(perfilDto.getEmail_perfil());
        perfil.setOcupacion_perfil(perfilDto.getOcupacion_perfil());
        perfil.setTelefono_perfil(perfilDto.getTelefono_perfil());
        perfil.setUrl_perfil(perfilDto.getUrl_perfil());
        perfil.setUrl_banner(perfilDto.getUrl_banner());
        perfil.setAcerca_de(perfilDto.getAcerca_de());
        perfilService.save(perfil);        
        return new ResponseEntity(new Mensaje("Registro del perfil actualizado"), HttpStatus.OK);
    }
    
}
