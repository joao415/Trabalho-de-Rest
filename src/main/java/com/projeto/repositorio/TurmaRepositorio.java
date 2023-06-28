package com.projeto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.data.modelo.TurmaModelo;

@Repository
public interface TurmaRepositorio extends CrudRepository<TurmaModelo, Integer> {
//    List<TurmaModelo> findAllByDisciplina(String disciplina);
//    List<TurmaModelo> findAllByProfessor(String professor);

}
