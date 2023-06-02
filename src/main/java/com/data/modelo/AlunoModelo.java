package com.data.modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoModelo extends UsuarioModelo {
    
	@ManyToMany
	@JoinTable(name="aluno_turma", 
	joinColumns=    {@JoinColumn(name="aluno_id")}, 
	inverseJoinColumns=      {@JoinColumn(name="turma_id")})
    public TurmaModelo turmas;
	
}
