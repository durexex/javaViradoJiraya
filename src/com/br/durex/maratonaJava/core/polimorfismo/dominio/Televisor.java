package com.br.durex.maratonaJava.core.polimorfismo.dominio;

public class Televisor extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.5;
    public Televisor(String nome, double valor) {
        super(nome, valor);

    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do televisor");
        return valor * IMPOSTO_POR_CENTO;
    }

}
