package com.consultorio.consultoriomedico.repository;

import com.consultorio.consultoriomedico.model.AtendenteEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository extends JpaRepository <AtendenteEntity, Integer> {
    
}
