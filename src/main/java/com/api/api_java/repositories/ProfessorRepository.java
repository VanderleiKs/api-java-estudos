package com.api.api_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api_java.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
    
}
