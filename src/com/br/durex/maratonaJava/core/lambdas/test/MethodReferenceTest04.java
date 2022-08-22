package com.br.durex.maratonaJava.core.lambdas.test;

import com.br.durex.maratonaJava.core.lambdas.dominio.Anime;
import com.br.durex.maratonaJava.core.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparator = () -> new AnimeComparators();
//        AnimeComparators animeComparators = () -> new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 200), new Anime("Maus", 2), new Anime("Nao sei", 15)));
        animeList.sort(AnimeComparators::compareByEpisodes);
    }
}
