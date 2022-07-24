package com.br.durex.maratonaJava.core.colecoes.test;

import com.br.durex.maratonaJava.core.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());

    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Maus", 45.00));
        mangas.add(new Manga(3L, "Palestino", 60.00));
        mangas.add(new Manga(2L, "A Odisseia de Hakin", 30.00));
        mangas.add(new Manga(4L, "This was the trinch war", 200.00));
        mangas.add(new Manga(1L, "Drunna", 30.00));

        for (Manga manga : mangas) {
            System.out.println(manga.getNome());
        }

        System.out.println("------------------------");
        System.out.println("------------------------");

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
//        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga.getNome());
        }


    }
}
