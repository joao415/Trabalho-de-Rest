package com.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.modelo.TurmaModelo;

public interface TurmaRepositorio extends CrudRepository<TurmaModelo, Integer> {
    
}
