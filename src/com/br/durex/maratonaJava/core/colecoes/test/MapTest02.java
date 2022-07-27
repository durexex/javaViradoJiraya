package com.br.durex.maratonaJava.core.colecoes.test;

import com.br.durex.maratonaJava.core.colecoes.domain.Consumidor;
import com.br.durex.maratonaJava.core.colecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Abelardo Barbosa");
        Consumidor c2 = new Consumidor("Marcelo Augusto");
//
//        System.out.println(c1);
//        System.out.println(c2);

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, manga1);
        consumidorManga.put(c2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + "  " + entry.getValue().getNome());
        }

    }
}
