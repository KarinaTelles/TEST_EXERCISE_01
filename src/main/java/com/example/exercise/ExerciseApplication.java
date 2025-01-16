package com.example.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
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
	}

}
