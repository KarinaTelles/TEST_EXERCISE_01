package com.example.exercise;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) throws IOException {
		/*###############EXERCÍCIO 01###############*/
		Loop exer1 = new Loop();
		int somaAoFinalDoLoop;
		somaAoFinalDoLoop = exer1.doLoop();
		System.out.println("VALOR DA VARIÁVEL ''SOMA'' NO FINAL DO PROCESSAMENTO: " + somaAoFinalDoLoop);
		/*##########################################*/
		/*###############EXERCÍCIO 02###############*/
		Fibonacci exer2 = new Fibonacci();
		exer2.fibonacciSequence();
		/*##########################################*/
		/*###############EXERCÍCIO 03###############*/
		Faturamento exer3 = new Faturamento();
		exer3.jsonReader();
		/*##########################################*/
		/*###############EXERCÍCIO 04###############*/
		FaturamentoPorEstado exer4 = new FaturamentoPorEstado();
		exer4.faturamento();
		/*##########################################*/
	}
}
/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
* */
