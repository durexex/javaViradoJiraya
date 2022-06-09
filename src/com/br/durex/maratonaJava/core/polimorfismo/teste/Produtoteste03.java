package com.br.durex.maratonaJava.core.polimorfismo.teste;

import com.br.durex.maratonaJava.core.polimorfismo.dominio.Computador;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Produto;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Tomate;
import com.br.durex.maratonaJava.core.polimorfismo.service.CalculadoraImposto;

public class Produtoteste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Micro Nervoso", 5500);

        Tomate tomate = new Tomate("Cereja", 26);
        tomate.setDataValidade("11/11/2022");


        CalculadoraImposto.calcularImposto(tomate);




    }
}
