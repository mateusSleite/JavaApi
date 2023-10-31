package com.mateus.java_api;

public class Usuario extends Pessoas {

    public Integer cadastro;

    public Usuario(String nome, Integer idade, Long cpf, Integer cadastro) {
        super(nome, idade, cpf);
        this.cadastro = cadastro;
    }

    public String toString() {
        return "Nome:" + this.nome + " Idade:" + this.idade + " CPF:" + this.cpf + " Cadastro:" + this.cadastro;
    }

}
