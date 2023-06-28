package com.projeto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.data.modelo.ProfessorModelo;

@Repository
public interface ProfessorRepositorio extends CrudRepository<ProfessorModelo, Integer> {
//    List<ProfessorModelo> findAllByDisciplina(String nome);
//    List<ProfessorModelo> findAllByProfessor(String nascimento);
}
