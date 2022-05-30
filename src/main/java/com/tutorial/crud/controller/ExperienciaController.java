
package com.tutorial.crud.controller;


import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.entity.Experiencia;
import com.tutorial.crud.dto.ExperienciaDto;
import com.tutorial.crud.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService experienciaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id_exp}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id_exp") int id_exp){
        if(!experienciaService.existsById(id_exp))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = experienciaService.getOne(id_exp).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody ExperienciaDto experienciaDto){    
        Experiencia experiencia = new Experiencia();
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setPuesto(experienciaDto.getPuesto());
        experiencia.setPais(experienciaDto.getPais());
        experiencia.setAnio_ingreso_exp(experienciaDto.getAnio_ingreso_exp());
        experiencia.setAnio_egreso_exp(experienciaDto.getAnio_egreso_exp());
        experiencia.setDescripcion(experienciaDto.getDescripcion());
        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("El producto fue creado"), HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id_exp}")
    public ResponseEntity<?> update(@PathVariable("id_exp")int id_exp, @RequestBody ExperienciaDto experienciaDto){
        
        Experiencia experiencia = experienciaService.getOne(id_exp).get();
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setPuesto(experienciaDto.getPuesto());
        experiencia.setPais(experienciaDto.getPais());
        experiencia.setAnio_ingreso_exp(experienciaDto.getAnio_ingreso_exp());
        experiencia.setAnio_egreso_exp(experienciaDto.getAnio_egreso_exp());
        experiencia.setDescripcion(experienciaDto.getDescripcion());
        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("Registro de Experiencia Actualizado"), HttpStatus.OK);
    }
  
  

    @DeleteMapping("/delete/{id_exp}")
    public ResponseEntity<?> delete(@PathVariable("id_exp")int id_exp){
        if(!experienciaService.existsById(id_exp))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de experiencia"), HttpStatus.NOT_FOUND);
        experienciaService.delete(id_exp);
        return new ResponseEntity(new Mensaje("Experiencia eliminado"), HttpStatus.OK);
    }

    
    
}
