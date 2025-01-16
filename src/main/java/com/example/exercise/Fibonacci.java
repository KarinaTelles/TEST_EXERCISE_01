package com.example.exercise;

public class Fibonacci {
    public void fibonacciSequence(){
        int valorLimite = 10;
        System.out.print("SEQUÊNCIA DE FIBONACCI COM "+ valorLimite +" NÚMEROS: ");
        for(int valorAtual = 0; valorAtual<valorLimite; valorAtual++){
            System.out.print(doFibonacci(valorAtual) + " ");
        }
    }
    public int doFibonacci(int n){
        int a = 0; int b = 1; int aux = 0;
        /*Os primeiros resultados são 1.
        Sequência: 1, 1, 2(1+1),3(1+2),5(3+2),8(5+3) etc.*/
        if(n<=1) {
            return n;
        }
        for (int i=2; i<=n; i++){
            aux=a+b;
            a=b;
            b=aux;
        }
        return b;
    }
}
