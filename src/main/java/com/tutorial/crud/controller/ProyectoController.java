
package com.tutorial.crud.controller;

import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.ProyectoDto;
import com.tutorial.crud.entity.Proyecto;
import com.tutorial.crud.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired
    ProyectoService proyectoService;
     
     @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list(){
        List<Proyecto> list = proyectoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id_proy}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id_proy") int id_proy){
        if(!proyectoService.existsById(id_proy))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = proyectoService.getOne(id_proy).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody ProyectoDto proyectoDto){    
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre_proyecto(proyectoDto.getNombre_proyecto());
        proyecto.setFecha_proyecto(proyectoDto.getFecha_proyecto());
        proyecto.setDescripcion_proyecto(proyectoDto.getDescripcion_proyecto());
        proyecto.setLink_proyecto(proyectoDto.getLink_proyecto());
        proyecto.setImagen_proyecto(proyectoDto.getImagen_proyecto());
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("El proyecto fue creado"), HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id_proy}")
    public ResponseEntity<?> update(@PathVariable("id_proy")int id_proy, @RequestBody ProyectoDto proyectoDto){
        
        Proyecto proyecto = proyectoService.getOne(id_proy).get();
        proyecto.setNombre_proyecto(proyectoDto.getNombre_proyecto());
        proyecto.setFecha_proyecto(proyectoDto.getFecha_proyecto());
        proyecto.setDescripcion_proyecto(proyectoDto.getDescripcion_proyecto());
        proyecto.setLink_proyecto(proyectoDto.getLink_proyecto());
        proyecto.setImagen_proyecto(proyectoDto.getImagen_proyecto());
        proyectoService.save(proyecto);     
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id_proy}")
    public ResponseEntity<?> delete(@PathVariable("id_proy")int id_proy){
        if(!proyectoService.existsById(id_proy))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de proyecto"), HttpStatus.NOT_FOUND);
        proyectoService.delete(id_proy);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }
    
    
    
}
