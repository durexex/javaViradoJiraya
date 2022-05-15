package com.br.durex.maratonaJava.core.blocosInicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("bloco d eincialização");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

        for (int episodio: episodios) {
            System.out.println(episodio + " ");
        }
    }
}
