package com.br.durex.maratonaJava.core.lambdas.test;

import com.br.durex.maratonaJava.core.lambdas.dominio.Anime;
import com.br.durex.maratonaJava.core.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 200), new Anime("Maus", 2), new Anime("Nao sei", 15)));
        animeList.sort(animeComparators::compareByEpsiodesNonStatic);
        System.out.println(animeList);

    }
}
