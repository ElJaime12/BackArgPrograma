package com.tutorial.crud.controller;

import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.EducacionDto;
import com.tutorial.crud.entity.Educacion;

import com.tutorial.crud.service.EducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {

    @Autowired
    EducacionService educacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!educacionService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Educacion educacion = educacionService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto){    
        Educacion educacion = new Educacion();
        educacion.setCentro(educacionDto.getCentro());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setTipo_estudio(educacionDto.getTipo_estudio());
        educacion.setAnio_ingreso(educacionDto.getAnio_ingreso());
        educacion.setAnio_egreso(educacionDto.getAnio_egreso());
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("El producto fue creado"), HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody EducacionDto educacionDto){
        
        Educacion educacion = educacionService.getOne(id).get();
        educacion.setCentro(educacionDto.getCentro());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setTipo_estudio(educacionDto.getTipo_estudio());
        educacion.setAnio_ingreso(educacionDto.getAnio_ingreso());
        educacion.setAnio_egreso(educacionDto.getAnio_egreso());
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Registro de Educacion Actualizado"), HttpStatus.OK);
    }
  
  

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!educacionService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de educacion"), HttpStatus.NOT_FOUND);
        educacionService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminado"), HttpStatus.OK);
    }


}
