package com.br.durex.maratonaJava.core.classesAbstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        salario *= 1.25;
    }

}
