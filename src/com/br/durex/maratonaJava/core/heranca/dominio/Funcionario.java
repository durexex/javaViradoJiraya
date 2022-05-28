package com.br.durex.maratonaJava.core.heranca.dominio;

public class Funcionario extends Pessoa {
    private double Salario;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(getSalario());
    }
}
