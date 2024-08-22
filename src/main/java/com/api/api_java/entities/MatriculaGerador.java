package com.api.api_java.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MatriculaGerador {
    
    private Long matricula;

    @Id
    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
    
    public Long next(){
        return matricula + 1;
    }
    
}
