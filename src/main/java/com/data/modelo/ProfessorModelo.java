package com.data.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class ProfessorModelo extends UsuarioModelo {

    private String cnpj;
    private float salario;

    @OneToMany
    @JoinColumn(name = "usuario_turma")
    private List<TurmaModelo> turmas;

    public String getCtps() {
        return cnpj;
    }
    public void setCtps(String cnpj) {
        this.cnpj = cnpj;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    } 
   
}
