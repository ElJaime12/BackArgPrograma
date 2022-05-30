
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Proyecto;
import com.tutorial.crud.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    ProyectoRepository proyectoRepository;
    
    public List<Proyecto> list(){
        return proyectoRepository.findAll();
          
        }
    
    public Optional<Proyecto> getOne(int id_proy){
        return proyectoRepository.findById(id_proy);
    }

  

    public void save(Proyecto proyecto){
        proyectoRepository.save(proyecto);
    }
    
    public void delete(int id_proy){
        proyectoRepository.deleteById(id_proy);
    }

    public boolean existsById(int id_proy){
        return proyectoRepository.existsById(id_proy);
    }

    
}
