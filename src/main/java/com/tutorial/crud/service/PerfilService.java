
package com.tutorial.crud.service;


import com.tutorial.crud.entity.Perfil;
import com.tutorial.crud.repository.PerfilRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PerfilService {
    
    @Autowired
    PerfilRepository perfilRepository;
    
    public List<Perfil> list(){
        return perfilRepository.findAll();
          
        }
    
    public Optional<Perfil> getOne(int id_perf){
        return perfilRepository.findById(id_perf);
    }

  

    public void save(Perfil perfil){
        perfilRepository.save(perfil);
    }
    
    public void delete(int id_perf){
        perfilRepository.deleteById(id_perf);
    }

    public boolean existsById(int id_perf){
        return perfilRepository.existsById(id_perf);
    }

    
}
