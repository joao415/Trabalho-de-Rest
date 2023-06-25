package com.projeto.controle;

import java.util.ArrayList;
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
import com.projeto.data.modelo.TurmaModelo;
import com.projeto.repositorio.TurmaRepositorio;

@RestController
@RequestMapping("/turmas")
public class TurmaControle {

    @Autowired
    private TurmaRepositorio acao;

    @PostMapping("")
    public TurmaModelo cadastrar(@RequestBody TurmaModelo obj) { 
        if(obj.getDisciplina().length()>=3 && obj.getDisciplina() != null) {
            return acao.save(obj);
        }
        System.out.println("Nome da disciplina é inválido! Precisa ter no min. 4 caracteres.");
        return null;
    }

    @GetMapping("")
    public Iterable<TurmaModelo> obter() {
        return acao.findAll();
    }

    @GetMapping("{@codigo}")
    public Optional<TurmaModelo> obterPorId(@RequestBody int codigo) {
        return acao.findById(codigo);
    }

    @PutMapping("")
    public TurmaModelo alterar(@RequestBody TurmaModelo obj){
        return acao.save(obj);
    }

    @DeleteMapping("{@codigo}")
    public void remover(@PathVariable int codigo) {
        acao.deleteById(codigo);
    }

    public void addAluno(AlunoModelo aluno) {
        TurmaModelo.alunos.add(aluno);
    }

    public void setAlunos(ArrayList<AlunoModelo> alunos) {
        TurmaModelo.alunos = alunos;
    }

    public AlunoModelo getAlunoById(long id) {
        for (AlunoModelo aluno: TurmaModelo.alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }

        return null;

    } 

    public void setProfessor(String professor) {
        TurmaModelo.setProfessor(professor);
    }

}
