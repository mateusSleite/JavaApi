package com.mateus.java_api;

public class Exercicio6 {

	public Exercicio6() {
	}

	public void Exercicio6() {
		Funcionario func = new Funcionario("Mateus", 19, 13174048907l, 92902093);
		Funcionario func2 = new Funcionario("Murilo", 25, 23174648907l, 92904095);
		Usuario usu = new Usuario("Benhur", 18, 13178949808l, 8145);
		Usuario usu2 = new Usuario("Renato", 19, 15178749708l, 7145);
		System.out.println(func.toString());
		System.out.println(func2.toString());
		System.out.println(usu.toString());
		System.out.println(usu2.toString());
	}

}
