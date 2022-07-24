package com.br.durex.maratonaJava.core.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste1 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Maus");
        mangas.add("MInotauro");
        mangas.add("Palestina");
        mangas.add("Drunna");
        mangas.add("Dom");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

    }
}
