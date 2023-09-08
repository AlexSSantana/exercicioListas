package com.entities;

public class Pessoas {
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoas() {

    }

    public Pessoas(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    
    
}
