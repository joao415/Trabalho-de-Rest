package com.data.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "turma")
  public class TurmaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String disciplina;
    private static String professor;

    @ManyToMany(mappedBy = "turmas")
    public static List<AlunoModelo> alunos = new ArrayList<>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getProfessor() {
        return professor;
    }
    public static void setProfessor(String professor) {
        professor = professor;
    }
    public TurmaModelo(long id, String disciplina, String professor) {
        this.id = id;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public String toString() {
        return this.getId() + " - " + this.getDisciplina() + " - " + this.getProfessor() + "\n";
    }
    

    
    
}
