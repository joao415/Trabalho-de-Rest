package com.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.data.modelo.UsuarioModelo;

public interface ProfessorRepositorio extends CrudRepository<ProfessorRepositorio, Integer> {
    List<UsuarioModelo> findAllByDisciplina(String nome);
    List<UsuarioModelo> findAllByProfessor(String nascimento);
}
