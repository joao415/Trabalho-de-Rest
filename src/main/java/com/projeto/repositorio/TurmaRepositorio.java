package com.projeto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projeto.data.modelo.TurmaModelo;

public interface TurmaRepositorio extends CrudRepository<TurmaModelo, Integer> {
    List<TurmaModelo> findAllByDisciplina(String disciplina);
    List<TurmaModelo> findAllByProfessor(String professor);

}