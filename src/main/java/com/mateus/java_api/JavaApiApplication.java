package com.mateus.java_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.io.Serial;
import java.text.MessageFormat;
import java.util.ArrayList;


@SpringBootApplication
public class JavaApiApplication {

	public static void main(String[] args) 
	{
		Exercicio1e2 exer1e2 = new Exercicio1e2();
		exer1e2.exercicio1e2();

		Exercicio3 exer3 = new Exercicio3();
		exer3.exercicio3();

		Exercicio4 exer4 = new Exercicio4();
		exer4.exercicio4();

		Exercicio5 exer5 = new Exercicio5();
		exer5.exercicio5();

		Funcionario func = new Funcionario("Mateus", 19, 13174048907l, 92902093);
		Funcionario func2 = new Funcionario("Murilo", 25, 23174648907l, 92904095);
		Usuario usu = new Usuario("Benhur", 18, 13178949808l, 8145);
		Usuario usu2 = new Usuario("Renato", 19, 15178749708l, 7145);

		System.out.println(MessageFormat.format("Nome:{0} Idade:{1} CPF:{2} EDV{3}" , func.nome, func.idade, func.cpf, func.edv));
		System.out.println(MessageFormat.format("Nome:{0} Idade:{1} CPF:{2} EDV{3}" , func2.nome, func2.idade, func2.cpf, func2.edv));




	}

}
