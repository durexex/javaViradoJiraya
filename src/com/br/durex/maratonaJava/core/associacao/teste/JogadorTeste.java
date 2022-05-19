package com.br.durex.maratonaJava.core.associacao.teste;

import com.br.durex.maratonaJava.core.associacao.dominio.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Pelé");
        Jogador jog2 = new Jogador("Zico");
        Jogador jog3 = new Jogador("Maradona");
        Jogador[] jogadores = {jog1, jog2, jog3};

        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }
    }
}
