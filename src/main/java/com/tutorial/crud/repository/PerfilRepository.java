
package com.tutorial.crud.repository;

import com.tutorial.crud.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
    
}
