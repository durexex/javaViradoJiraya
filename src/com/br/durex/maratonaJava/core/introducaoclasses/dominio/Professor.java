package com.br.durex.maratonaJava.core.introducaoclasses.dominio;

public class Professor {

    public String nome;
    public int idade;
    public char sexo;

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }

    public Professor() {

    }
}
