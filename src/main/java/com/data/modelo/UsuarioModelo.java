package com.data.modelo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.data.enums.ETipoDocumento;


public abstract class UsuarioModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Date nascimento;
    private ETipoDocumento tipoDocumento;
    private String documento;

    public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public ETipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(ETipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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

}
