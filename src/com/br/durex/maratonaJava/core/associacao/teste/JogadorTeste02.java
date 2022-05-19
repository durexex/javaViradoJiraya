package com.br.durex.maratonaJava.core.associacao.teste;

import com.br.durex.maratonaJava.core.associacao.dominio.Jogador;
import com.br.durex.maratonaJava.core.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador pele = new Jogador("Pelé");

        Time figueira = new Time("Figueirense Futebol Clube");

        pele.setTime(figueira);
        pele.imprimir();
    }
}
