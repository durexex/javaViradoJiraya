package com.br.durex.maratonaJava.introducao;

public class Aula06Repeticao02 {
    public static void main(String[] args) {
        //Imprimr todos os pares até 1000000
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
