package com.data.modelo;

import java.util.Date;

//import com.data.enums.ETipoDocumento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

public abstract class UsuarioModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Date nascimento;
//    private ETipoDocumento tipoDocumento;
    private String documento;

    public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
//	public ETipoDocumento getTipoDocumento() {
//		return tipoDocumento;
//	}
//
//	public void setTipoDocumento(ETipoDocumento tipoDocumento) {
//		this.tipoDocumento = tipoDocumento;
//	}

}
