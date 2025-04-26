package com.example.meu_primeiro_spring_boot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pudutos")
public class Produto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long id;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setPrco(Double preco){
        this.preco = preco;
    }

    public Double setPreco(Double preco){
        return preco;
    }

}
