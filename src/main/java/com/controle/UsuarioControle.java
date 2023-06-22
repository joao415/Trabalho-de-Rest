package com.controle;

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

import com.data.modelo.UsuarioModelo;
import com.repositorio.ProfessorRepositorio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControle {
    public static ArrayList<UsuarioModelo> Usuarioes = new ArrayList<UsuarioModelo>();

    @Autowired
    private ProfessorRepositorio acao;

	/*
	 * @PostMapping("") public UsuarioModelo cadastrar(@RequestBody UsuarioModelo
	 * obj) { if(obj.getNome().length()>=3){ return acao.save(obj); } System.out.
	 * println("Nome do usuário é inválido! Precisa ter no min. 4 caracteres.");
	 * return null; }
	 * 
	 * @GetMapping("") public Iterable<UsuarioModelo> obter() { return
	 * acao.findAll(); }
	 * 
	 * @GetMapping("{@codigo}") public Optional<UsuarioModelo>
	 * obterPorId(@RequestBody int codigo) { return acao.findById(codigo); }
	 * 
	 * @PutMapping("") public UsuarioModelo alterar(@RequestBody UsuarioModelo obj){
	 * return acao.save(obj); }
	 */
    
    @DeleteMapping("{@codigo}")
    public void remover(@PathVariable int codigo) {
        acao.deleteById(codigo);
    }

}
