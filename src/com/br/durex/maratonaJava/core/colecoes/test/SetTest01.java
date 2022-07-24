package com.br.durex.maratonaJava.core.colecoes.test;

import com.br.durex.maratonaJava.core.colecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();


        mangas.add(new Manga(5L, "Maus", 45.00));
        mangas.add(new Manga(3L, "Palestino", 60.00));
        mangas.add(new Manga(2L, "A Odisseia de Hakin", 30.00));
        mangas.add(new Manga(4L, "This was the trinch war", 200.00));
        mangas.add(new Manga(1L, "Drunna", 30.00));

        for(Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
