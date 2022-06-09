package com.br.durex.maratonaJava.core.polimorfismo.service;

import com.br.durex.maratonaJava.core.polimorfismo.dominio.Computador;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Produto;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório de Imposto do Computador");
//        double imposto = computador.calcularImposto();
//
//        System.out.println("Impodsto do computador " + computador.getNome() + " valor " + computador.getValor());
//        System.out.println("Valor Imposto " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatório de Imposto do Tomate");
//        double imposto = tomate.calcularImposto();
//
//        System.out.println("Impodsto do computador " + tomate.getNome() + " valor " + tomate.getValor());
//        System.out.println("Valor Imposto " + imposto);
//    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto");

        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("valor " + produto.getValor());
        System.out.println("Imposto " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }

}
