package com.projeto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projeto.data.modelo.ProfessorModelo;
import com.projeto.data.modelo.UsuarioModelo;

public interface ProfessorRepositorio extends CrudRepository<ProfessorModelo, Integer> {
    List<UsuarioModelo> findAllByDisciplina(String nome);
    List<UsuarioModelo> findAllByProfessor(String nascimento);
}
