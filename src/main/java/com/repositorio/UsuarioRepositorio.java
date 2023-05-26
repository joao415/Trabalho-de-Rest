package com.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.modelo.UsuarioModelo;

public interface UsuarioRepositorio extends CrudRepository<UsuarioModelo, Integer> {
    
}
