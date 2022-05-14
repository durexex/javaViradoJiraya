package com.br.durex.maratonaJava.introducao;

public class Aula05Condicionais02 {
    public static void main(String[] args) {
        // idade < 15 infantil
        // idade >= 15 e idade <18 juvenil
        // senao adulto

        int idade = 17;

        if (idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}
