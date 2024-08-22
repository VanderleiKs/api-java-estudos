package com.api.api_java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.api_java.controllers.dtos.ProfessorInsert;
import com.api.api_java.entities.Professor;
import com.api.api_java.repositories.ProfessorRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/professor")
public class ProfessorController {
    
    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping()
    public ResponseEntity<List<Professor>> getAllProfessores() {
        return ResponseEntity.ok(professorRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity<Professor> newProfessor(@RequestBody ProfessorInsert entity) {
        var professor = new Professor();
        professor.setName(entity.name());
        
        return ResponseEntity.ok(professorRepository.save(professor));
    }
    
    
}
