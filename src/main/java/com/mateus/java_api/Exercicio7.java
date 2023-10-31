package com.mateus.java_api;

import java.util.ArrayList;

public class Exercicio7 {

    public Exercicio7() {
    }

    public void exercicio7() {
        ArrayList<Funcionario> funcio = new ArrayList();
        Funcionario[] funciov = new Funcionario[2];

        Funcionario func1 = new Funcionario("Mateus", 19, 13174048907l, 92902093);
        Funcionario func2 = new Funcionario("Murilo", 25, 23174648907l, 92904095);

        funcio.add(func1);
        funcio.add(func2);

        funciov[0] = func1;
        funciov[1] = func1;

        for (Pessoas itens : funcio) {
            System.out.println(itens);
        }

        for (Pessoas itens : funciov) {
            System.out.println(itens);
        }

    }

}
