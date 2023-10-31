package com.mateus.java_api;

public class Funcionario extends Pessoas {

    public Integer edv;

    public Funcionario(String nome, Integer idade, Long cpf, Integer edv) {
        super(nome, idade, cpf);
        this.edv = edv;
    }

    public String toString() {
        return "Nome:" + this.nome + " Idade:" + this.idade + " CPF:" + this.cpf + " EDV:" + this.edv;
    }
}
