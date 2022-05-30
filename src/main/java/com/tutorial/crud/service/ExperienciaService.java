
package com.tutorial.crud.service;


import com.tutorial.crud.entity.Experiencia;
import com.tutorial.crud.repository.EducacionRepository;
import com.tutorial.crud.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    ExperienciaRepository experienciaRepository;
    
    public List<Experiencia> list(){
        return experienciaRepository.findAll();
          
        }
    
    public Optional<Experiencia> getOne(int id_exp){
        return experienciaRepository.findById(id_exp);
    }

  

    public void  save(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }
    
    public void delete(int id_exp){
        experienciaRepository.deleteById(id_exp);
    }

    public boolean existsById(int id_exp){
        return experienciaRepository.existsById(id_exp);
    }

    
    
    
}
