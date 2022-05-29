package com.br.durex.maratonaJava.core.modificadorFinal.teste;

import com.br.durex.maratonaJava.core.modificadorFinal.dominio.Carro;
import com.br.durex.maratonaJava.core.modificadorFinal.dominio.Comprador;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Mercedes");

        System.out.println(Carro.COMPRADOR);
        Carro.COMPRADOR.setNome("Jucileunom");

        System.out.println(Carro.COMPRADOR);
    }
}
