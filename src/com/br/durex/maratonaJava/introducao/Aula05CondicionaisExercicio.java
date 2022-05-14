package com.br.durex.maratonaJava.introducao;

public class Aula05CondicionaisExercicio {
    public static void main(String[] args) {

        double salario = 125000;

        double primeiraAliquota = 0.097;
        double segundaAliquota = 0.3735;
        double terceiraAliquota = 0.4950;

        double valorImpostoPagar = 0;

        if (salario < 34712) {
            valorImpostoPagar = salario * primeiraAliquota;
        } else if (salario > 34713 && salario < 68508) {
            valorImpostoPagar = salario * segundaAliquota;
        } else {
            valorImpostoPagar = salario * terceiraAliquota;
        }

        System.out.println(valorImpostoPagar);
    }
}
