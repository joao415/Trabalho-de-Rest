package com.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoModelo extends UsuarioModelo {
    private float nota1;
    private float nota2;

    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    
}
