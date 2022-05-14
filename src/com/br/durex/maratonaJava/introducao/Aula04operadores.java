package com.br.durex.maratonaJava.introducao;


public class Aula04operadores{
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;


        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && AND
        // || OR
        // !  NOT

        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMarioQue30 = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQue30 = idade <= 30 && salario >= 4612;

        System.out.println("isDentroDaLeiMarioQue30 " + isDentroDaLeiMarioQue30);
        System.out.println("isDentroDaLeiMenorQue30 " + isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlay = 5000F;

        boolean isPlaystation5Afordable = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;
        System.out.println("isPlaystation5Afordable " + isPlaystation5Afordable);

        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;

        bonus *= 2;
        bonus /= 2;

        bonus %= 2;

        System.out.println("bonus " + bonus);

        int contador = 1;

        contador += 1;

        contador++;
        contador--;

        System.out.println("contador "+ contador);




    }
}
