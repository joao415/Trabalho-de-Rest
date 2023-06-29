package com.projeto.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.data.modelo.AlunoModelo;
import com.projeto.data.modelo.ProfessorModelo;
import com.projeto.data.modelo.TurmaModelo;
import com.projeto.repositorio.AlunoRepositorio;
import com.projeto.repositorio.ProfessorRepositorio;
import com.projeto.repositorio.TurmaRepositorio;

@RestController
@RequestMapping("/turmas")
public class TurmaControle {

	@Autowired
	private TurmaRepositorio acaoTurma;
	@Autowired
	private AlunoRepositorio acaoAluno;
	@Autowired
	private ProfessorRepositorio acaoProfessor;

	@PostMapping("")
	public TurmaModelo cadastrar(@RequestBody TurmaModelo obj) {
	    if (obj.getDisciplina().length() >= 3 && obj.getDisciplina() != null) {
	        if (obj.getAlunos() != null && !obj.getAlunos().isEmpty()) {
	            for (AlunoModelo aluno : obj.getAlunos()) {
	                if (aluno.getId() == 0) {
	                    acaoAluno.save(aluno);
	                }
	            }
	        }
	        ProfessorModelo professor = obj.getProfessor();
	        
	        if (professor != null && professor.getId() == 0) {
	        	acaoProfessor.save(professor);
	        }
	        
	        return acaoTurma.save(obj);
	    }
	    
	    throw new IllegalArgumentException("Nome da disciplina é inválido! Precisa ter no mínimo 4 caracteres.");
	    // System.out.println("Nome da disciplina é inválido! Precisa ter no mínimo 4 caracteres.");
	    // return null;
	}

	
	@GetMapping("")
	public Iterable<TurmaModelo> obter() {
		return acaoTurma.findAll();
	}

	@GetMapping("/{codigo}")
	public Optional<TurmaModelo> obterPorId(@RequestBody int codigo) {
		return acaoTurma.findById(codigo);
	}

	@PutMapping("")
	public TurmaModelo alterar(@RequestBody TurmaModelo obj) {
		return acaoTurma.save(obj);
	}

	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable int codigo) {
		acaoTurma.deleteById(codigo);
	}

	@PutMapping("/{codigo}")
	public void addAlunoNaTurma(@PathVariable int codigo, @RequestBody AlunoModelo aluno) {
		Optional<TurmaModelo> turmaOpt = acaoTurma.findById(codigo);
		
		if(turmaOpt != null)
		{
			TurmaModelo turma = turmaOpt.get();
			turma.getAlunos().add(aluno);
			
			acaoTurma.save(turma);
		}
		else {
			throw new NullPointerException("Não Existe Turma!");
		}
			
	}
//
//	public void setAlunos(ArrayList<AlunoModelo> alunos) {
//		alunos = alunos;
//	}
//
//	public AlunoModelo getAlunoById(long id) {
//		for (AlunoModelo aluno : TurmaModelo.alunos) {
//			if (aluno.getId() == id) {
//				return aluno;
//			}
//		}
//
//		return null;
//
//	}
//
//	public void setProfessor(String professor) {
//		setProfessor(professor);
//	}

}
