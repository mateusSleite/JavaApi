package com.mateus.java_api;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1e2 {

	float media = 0;
	float soma = 0;
	float nota = 0;

	public Exercicio1e2() {
	}

	public void exercicio1e2() {
		Scanner ler = new Scanner(System.in);

		float[] notasp = new float[3];

		ArrayList<Float> notas = new ArrayList();

		for (int x = 0; x < 3; x++) {
			System.out.println("Digite a " + (x + 1) + " nota");
			this.nota = ler.nextFloat();
			notas.add(this.nota);
		}

		for (int n = 0; n < notas.size(); n++) {
			this.soma = this.soma + notas.get(n);
		}

		this.media = this.soma / 3;

		System.out.println("A média foi " + media);

		if (media >= 9.0) {
			System.out.println("Parabéns");
		} else if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media <= 3.0) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Recuperação");
		}

	}

}
