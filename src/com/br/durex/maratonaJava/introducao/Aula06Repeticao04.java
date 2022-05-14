package com.br.durex.maratonaJava.introducao;

public class Aula06Repeticao04 {
    public static void main(String[] args) {
        // valro da parcela >= 1000
        double valorCarro = 95420;
        for (int i = 1; i <= valorCarro; i++) {

            double valorParcela = valorCarro / i;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println(i + " parcelas com valor de " + (int) valorParcela);
        }


//        double numeroParcelas = valorCarro / valorParcela;
//        int numeroParcelasTruncado = (int)numeroParcelas;
//
//        System.out.println(numeroParcelasTruncado);

    }
}
