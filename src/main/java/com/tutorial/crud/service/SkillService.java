
package com.tutorial.crud.service;


import com.tutorial.crud.entity.Skill;
import com.tutorial.crud.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService {
     @Autowired
    SkillRepository skillRepository;
    
    public List<Skill> list(){
        return skillRepository.findAll();
          
        }
    
    public Optional<Skill> getOne(int id_skills){
        return skillRepository.findById(id_skills);
    }

  

    public void save(Skill skill){
        skillRepository.save(skill);
    }
    
    public void delete(int id_skills){
        skillRepository.deleteById(id_skills);
    }

    public boolean existsById(int id_skills){
        return skillRepository.existsById(id_skills);
    }
    
}
