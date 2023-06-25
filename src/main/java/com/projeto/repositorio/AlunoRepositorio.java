package com.projeto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projeto.data.modelo.AlunoModelo;
import com.projeto.data.modelo.UsuarioModelo;

public interface AlunoRepositorio extends CrudRepository<AlunoModelo, Integer> {
    List<UsuarioModelo> findAllByDisciplina(String nome);
    List<UsuarioModelo> findAllByProfessor(String nascimento);
}
