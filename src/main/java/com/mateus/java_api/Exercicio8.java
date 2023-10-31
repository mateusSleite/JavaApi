package com.mateus.java_api;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

    public Integer tam;
    public Integer num;
    public Integer maior = 0;

    public Exercicio8() {
    }

    public void exercicio8() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista:");
        this.tam = ler.nextInt();

        Integer[] funciov = new Integer[tam];

        for (int i = 0; i < funciov.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número");
            num = ler.nextInt();
            funciov[i] = num;
            if (funciov[i] > maior)
                maior = funciov[i];
        }

        System.out.println("O maior número é o " + maior);

    }

}
