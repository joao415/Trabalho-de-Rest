package com.projeto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.data.modelo.AlunoModelo;

@Repository
public interface AlunoRepositorio extends CrudRepository<AlunoModelo, Integer> {
//    List<AlunoModelo> findAllByDisciplina(String nome);
//    List<AlunoModelo> findAllByProfessorId(long professorId);
}
