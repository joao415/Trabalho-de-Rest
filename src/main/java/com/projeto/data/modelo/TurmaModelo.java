package com.projeto.data.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class TurmaModelo {
	@Id
	@GeneratedValue
	private long id;
	
	private String disciplina;
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private ProfessorModelo professor;

	 @ManyToMany
    @JoinTable(
        name = "aluno_turma",
        joinColumns = @JoinColumn(name = "turma_id"),
        inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    public List<AlunoModelo> alunos = new ArrayList<>();

	public TurmaModelo() {
		
	}
	
	public List<AlunoModelo> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<AlunoModelo> alunos) {
		this.alunos = alunos;
	}

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

	public String toString() {
		return this.getId() + " - " + this.getDisciplina() + " - " + this.getProfessor().getNome() + "\n";
	}

	public ProfessorModelo getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorModelo professor) {
		this.professor = professor;
	}

}
