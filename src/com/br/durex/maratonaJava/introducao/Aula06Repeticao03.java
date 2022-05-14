package com.br.durex.maratonaJava.introducao;

public class Aula06Repeticao03 {
    public static void main(String[] args) {
        int valorMaximo = 50;
        for (int i = 0; i < valorMaximo; i++) {
            System.out.println(i);

            if (i == 25) {
                break;
            }
        }
    }
}
