package com.br.durex.maratonaJava.core.introducaometodos.dominio;

public class Pessoa {
    private String Nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        Nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade < 0) {
            System.out.println("Nã nã ni nã não");
            return;
        }

        this.idade = idade;
    }

}
