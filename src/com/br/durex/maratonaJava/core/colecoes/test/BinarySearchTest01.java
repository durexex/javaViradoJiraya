package com.br.durex.maratonaJava.core.colecoes.test;

import com.br.durex.maratonaJava.core.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
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

        Collections.sort(mangas);
//       System.out.println(Collections.binarySearch(numeros, 2));

        for (Manga manga : mangas) {
            System.out.println(manga.getNome());
        }

        System.out.println("******************************");
        System.out.println("******************************");

        Manga mangaToSearch = new Manga(1L, "Dragon ball Z", 15.00);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
