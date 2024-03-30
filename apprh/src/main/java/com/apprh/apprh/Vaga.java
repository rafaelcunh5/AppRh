package com.apprh.apprh.models;

import java.io.Serializable;
import java.util.list;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Generationtype;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.validation.constraints.NotEmpty;


public class Vaga implements Serializable {
    
    private static final long serrialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @NotEmpty
    private String nome;

    @NotEmpty 
    private String decricao;

    @NotEmpty
    private String data;

    @NotEmpty 
    private String salario;

    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
    private List<Candidato> candidatos;

    public long getCodigo(){
        return codigo;
    }
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }

    

}
