package com.br.durex.maratonaJava.core.associacao.dominio;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita tu nombre");
        String nome = teclado.nextLine();

        System.out.println("Digita tu anos");
        int idade = teclado.nextInt();
        System.out.println(idade);

        System.out.println("M o F para genero");
        char genero  = teclado.next().charAt(0);
        System.out.println(genero);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);


    }
}
