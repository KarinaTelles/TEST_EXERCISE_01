package com.example.exercise;

public class InverteString {
    public void invertendoAString(){
        String original="teste";
        String invertida="";
        //loop de trás para frente
        for(int i = original.length()-1;i>=0;i--){
            invertida+=original.charAt(i);
        }
        System.out.println(invertida);
    }
}
/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
* */