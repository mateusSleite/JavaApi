package com.mateus.java_api;
import java.io.Serial;
import java.util.Scanner;

public class Exercicio9 {

    public String frase;

    public Exercicio9() { }

    public void exercicio9()
    {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        this.frase = ler.nextLine();

        String frases[] = frase.split(" ");

        if(frases.length % 2 == 0)
        {
            System.out.println(frases[frases.length/2 - 1]);
            System.out.println(frases[frases.length/2]);
        }

        else
            System.out.println(frases[frases.length/2]);

    }
}
