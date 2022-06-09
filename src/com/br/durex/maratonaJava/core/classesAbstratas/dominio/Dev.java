package com.br.durex.maratonaJava.core.classesAbstratas.dominio;

public class Dev extends Funcionario {
    public Dev(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        salario *= 1.05;
    }
}
