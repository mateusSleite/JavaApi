package com.mateus.java_api;

public class Usuario extends Pessoas {

    public Integer cadastro;

    public Usuario(String nome, Integer idade, Long cpf, Integer cadastro) {
        super(nome, idade, cpf);
        this.cadastro = cadastro;
    }
    
}
