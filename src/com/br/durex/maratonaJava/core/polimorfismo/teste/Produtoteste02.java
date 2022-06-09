package com.br.durex.maratonaJava.core.polimorfismo.teste;

import com.br.durex.maratonaJava.core.polimorfismo.dominio.Computador;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Produto;
import com.br.durex.maratonaJava.core.polimorfismo.dominio.Tomate;

public class Produtoteste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Micro Nervoso", 5500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        Produto produto2 = new Tomate("Cereja", 26);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());





    }
}
