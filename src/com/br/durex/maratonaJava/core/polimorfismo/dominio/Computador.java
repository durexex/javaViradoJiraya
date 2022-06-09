package com.br.durex.maratonaJava.core.polimorfismo.dominio;

public class Computador extends Produto {

    public static final double IMPOSTO_COMPUTADOR = 0.17;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Imposto do computador");
        return valor * IMPOSTO_COMPUTADOR;
    }
}
