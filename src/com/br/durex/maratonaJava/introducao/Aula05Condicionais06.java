package com.br.durex.maratonaJava.introducao;

public class Aula05Condicionais06 {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Útil");
                break;

            default:
                System.out.println("ERRO");
                break;

        }
    }
}
