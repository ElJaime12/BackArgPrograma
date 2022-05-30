
package com.tutorial.crud.controller;

import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.SkillDto;
import com.tutorial.crud.entity.Skill;
import com.tutorial.crud.service.SkillService;
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
@RequestMapping("/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
     @Autowired
    SkillService skillService;
     
     @GetMapping("/lista")
    public ResponseEntity<List<Skill>> list(){
        List<Skill> list = skillService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id_skills}")
    public ResponseEntity<Skill> getById(@PathVariable("id_skills") int id_skills){
        if(!skillService.existsById(id_skills))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Skill skill = skillService.getOne(id_skills).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody SkillDto skillDto){    
        Skill skill = new Skill();
        skill.setHabilidad(skillDto.getHabilidad());
        skill.setPorcentaje(skillDto.getPorcentaje());
        skillService.save(skill);
        return new ResponseEntity(new Mensaje("El skill fue creado"), HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id_skills}")
    public ResponseEntity<?> update(@PathVariable("id_skills")int id_skills, @RequestBody SkillDto skillDto){
        
        Skill skill = skillService.getOne(id_skills).get();
        skill.setHabilidad(skillDto.getHabilidad());
        skill.setPorcentaje(skillDto.getPorcentaje());
        skillService.save(skill);     
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id_skills}")
    public ResponseEntity<?> delete(@PathVariable("id_skills")int id_skills){
        if(!skillService.existsById(id_skills))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de skill"), HttpStatus.NOT_FOUND);
        skillService.delete(id_skills);
        return new ResponseEntity(new Mensaje("Skill eliminado"), HttpStatus.OK);
    }
    
    
}
