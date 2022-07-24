package com.br.durex.maratonaJava.core.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("marcelo");
        nomes.add("noel");
        nomes.add("alceu");

        for (String nome: nomes) {
            System.out.println(nome);
        }



    }
}
