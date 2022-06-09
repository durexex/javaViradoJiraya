package com.br.durex.maratonaJava.core.polimorfismo.dominio;

public class Tomate extends Produto {

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    private String dataValidade;

    public static final double IMPOSTO_TOMATE = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularImposto() {
        System.out.println("Imposto do tomate");
        return valor * IMPOSTO_TOMATE;
    }
}
