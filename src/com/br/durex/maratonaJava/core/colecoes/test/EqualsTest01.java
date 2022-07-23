package com.br.durex.maratonaJava.core.colecoes.test;

import com.br.durex.maratonaJava.core.colecoes.domain.Celuloso;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "Eduardi";
        String nome2 = new String("Eduardi");
        System.out.println(nome1.equals(nome2));

        Celuloso cel1 = new Celuloso("a1EEC33", "LG");
        Celuloso cel2 = new Celuloso("a1EEC33", "LG");
        Celuloso cel3 = cel2;

        System.out.println(cel1 == cel2);
        System.out.println(cel2 == cel3);


    }
}
