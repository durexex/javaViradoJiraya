package com.br.durex.maratonaJava.core.polimorfismo.teste;

import com.br.durex.maratonaJava.core.polimorfismo.dominio.Computador;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Televisor;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Tomate;
import com.br.durex.maratonaJava.core.polimorfismo.service.CalculadoraImposto;

public class Produtoteste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD RAYZER", 11000);
        Tomate tomate = new Tomate("Tomate longa vida", 9);
        Televisor tv = new Televisor("Samsung", 4500);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);

    }
}
