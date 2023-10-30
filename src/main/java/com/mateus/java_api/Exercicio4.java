package com.mateus.java_api;

import java.util.ArrayList;

public class Exercicio4 {

    public Exercicio4() {
    }

    public void exercicio4() {

        System.out.println("");

        ArrayList<Integer> nums = new ArrayList();

        for (int x = 1000; x < 2000; x++) {
            if ((x % 11) == 5) {
                System.out.print(x);
                if(x != 1996 )
                    System.out.print(", ");
            }
        }
    }

}
