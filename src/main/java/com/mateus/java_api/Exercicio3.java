package com.mateus.java_api;

import java.util.Scanner;

public class Exercicio3 {
	float soma = 0;
	float nota = 0;
	float[] notasp = new float[3];

	public Exercicio3() {
	}

	public void exercicio3() {
		Scanner ler = new Scanner(System.in);

		System.out.print("\n");
		System.out.println("Digite agora as outras 3 notas de outra matéria");

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a " + (i + 1) + " nota");
			nota = ler.nextFloat();
			notasp[i] = nota;
		}

		for (int i = 0; i < 3; i++) {
			soma = soma + notasp[i];
		}

		System.out.println("A Soma foi " + soma);
	}
}
