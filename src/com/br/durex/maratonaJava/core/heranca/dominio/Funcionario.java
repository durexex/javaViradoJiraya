package com.br.durex.maratonaJava.core.heranca.dominio;

public class Funcionario extends Pessoa {
    private double Salario;

    static {
        System.out.println("Dentro static funcionario");
    }
    {
        System.out.println("Inicialização funcionario não static 1");
    }
    {
        System.out.println("Inicialização funcionario não static 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro construtor funcionadio");
    }

    public Funcionario(){

    }

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
