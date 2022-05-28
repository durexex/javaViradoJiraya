package com.br.durex.maratonaJava.core.associacao.teste;

import com.br.durex.maratonaJava.core.associacao.dominio.Jogador;
import com.br.durex.maratonaJava.core.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {


        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Jogador[] jogadores = {jogador, jogador2};

        Time time = new Time("Brasil");
        time.setJogadores(jogadores);

        jogador.setTime(time);

        System.out.println("--JOgador--");
        jogador.imprimir();

        System.out.println("--Time--");
        time.imprimir();
    }
}
