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

import com.projeto.data.modelo.ProfessorModelo;
import com.projeto.data.modelo.UsuarioModelo;
import com.projeto.repositorio.ProfessorRepositorio;

@RestController
@RequestMapping("/professor")
public class ProfessorControle {
    public static ArrayList<ProfessorModelo> Usuarioes = new ArrayList<ProfessorModelo>();

	    private ProfessorRepositorio acao;

	
	  @PostMapping("")
	  public ProfessorModelo cadastrar(@RequestBody ProfessorModelo obj)
	  {
		  if(obj.getNome().length()>=3){
			  return acao.save(obj);
		  }
		  System.out.println("Nome do usuário é inválido! Precisa ter no min. 4 caracteres.");
	  	return null;
	  }
	  
	  @GetMapping("") public Iterable<ProfessorModelo> obter()
	  {
		  return acao.findAll(); 
	  }
	  
	  @GetMapping("{@codigo}") public Optional<ProfessorModelo> obterPorId(@RequestBody int codigo)
	  { 
		  return acao.findById(codigo);
	  }
	  
	  @PutMapping("") public ProfessorModelo alterar(@RequestBody ProfessorModelo obj){
	  return acao.save(obj); }
	 
    
    @DeleteMapping("{@codigo}")
    public void remover(@PathVariable int codigo) {
        acao.deleteById(codigo);
    }

}
