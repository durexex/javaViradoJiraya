package com.br.durex.maratonaJava.core.classesAbstratas.dominio;

public abstract  class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calcularBonus();

    @Override
    public void imprimir() {
        System.out.println("Funcionario");
    }
}
