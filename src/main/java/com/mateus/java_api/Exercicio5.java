package com.mateus.java_api;
import java.util.ArrayList;

public class Exercicio5 {

    int impar = 0;
    int par = 0;

    public  Exercicio5(){}

    public void exercicio5()
    {

        System.out.println("\n");

        for (int x = 0; x < 1001; x++)
        {
            if(x % 2 == 0)
            {
                par++;
            }
            else
            {
                impar++;
            }
        }

        System.out.println("Tem " + par + " pares");
        System.out.println("Tem " + impar + " ímpares");
        
    }
}
