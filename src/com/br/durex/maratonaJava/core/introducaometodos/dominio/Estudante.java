package com.br.durex.maratonaJava.core.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public Estudante() {
    };

    public Estudante(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println(toString());
    }

}
