package com.br.durex.maratonaJava.core.modificadorEstatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("bloco de incialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: episodios) {
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public static int[] getEpisodios() {
        return episodios;
    }
}
