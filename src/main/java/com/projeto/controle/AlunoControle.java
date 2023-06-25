package com.projeto.controle;

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

import com.projeto.data.modelo.AlunoModelo;
import com.projeto.data.modelo.UsuarioModelo;
import com.projeto.repositorio.AlunoRepositorio;

@RestController
@RequestMapping("/aluno")
public class AlunoControle {
    public static ArrayList<AlunoModelo> Usuarioes = new ArrayList<AlunoModelo>();

	    private AlunoRepositorio acao;

	
	  @PostMapping("")
	  public AlunoModelo cadastrar(@RequestBody AlunoModelo obj)
	  {
		  if(obj.getNome().length()>=3){
			  return acao.save(obj);
		  }
		  System.out.println("Nome do usuário é inválido! Precisa ter no min. 4 caracteres.");
	  	return null;
	  }
	  
	  @GetMapping("")
	  public Iterable<AlunoModelo> obter()
	  {
		  return acao.findAll(); 
	  }
	  
	  @GetMapping("{@codigo}") public Optional<AlunoModelo> obterPorId(@RequestBody int codigo)
	  { 
		  return acao.findById(codigo);
	  }
	  
	  @PutMapping("") public AlunoModelo alterar(@RequestBody AlunoModelo obj){
	  return acao.save(obj); }
	 
    
    @DeleteMapping("{@codigo}")
    public void remover(@PathVariable int codigo) {
        acao.deleteById(codigo);
    }

}
