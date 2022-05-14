package com.br.durex.maratonaJava.core.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];

     public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    @Override
    public String toString() {
        return "Funcinario{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                '}';
    }

    public void imprimir() {
        System.out.println(toString());
        System.out.println();

        for (double salario: getSalarios()) {
            System.out.println(salario);
        }
    }

    public void adicinarSalario(double salario) {

        for(int i=0; i < this.getSalarios().length; i++){
            if(this.getSalarios()[i] == 0.0){
                this.getSalarios()[i] = salario;
                break;
            }
        }

        mediaSalarial();
    }

    public double mediaSalarial() {

        double soma = 0;
        for (double salario: salarios) {
            soma += salario;
        }

        double total = soma / getSalarios().length;

        return total;
    }


}
