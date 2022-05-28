package com.br.durex.maratonaJava.core.associacao.dominio;

import java.util.Arrays;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimir() {
        System.out.println(nome);

        if (jogadores == null) {
            return;
        }

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }


    @Override
    public String toString() {
        return "Time{" +
                "nme='" + nome + '\'' +
                ", jogadores=" + Arrays.toString(jogadores) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
