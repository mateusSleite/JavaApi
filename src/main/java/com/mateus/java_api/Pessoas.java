package com.mateus.java_api;

import java.util.ArrayList;

public abstract class Pessoas {
    public String nome;
    public Integer idade;
    public Long cpf;

    public Pessoas(String nome, Integer idade, Long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

}
