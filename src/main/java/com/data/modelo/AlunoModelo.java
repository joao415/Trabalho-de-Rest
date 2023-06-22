package com.data.modelo;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "alunos")
public class AlunoModelo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Date nascimento;
//    private ETipoDocumento tipoDocumento;
    private String documento;

    public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
//	@ManyToMany
//	@JoinColumn(name="aluno_turma", 
//	joinColumns=    {@JoinColumn(name="aluno_id")}, 
//	inverseJoinColumns=      {@JoinColumn(name="turma_id")})
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "aluno_turma", 
        joinColumns = { @JoinColumn(name = "aluno_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "turma_id") })
    public List<TurmaModelo> turmas;
	
}
