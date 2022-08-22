package com.br.durex.maratonaJava.core.lambdas.test;

import com.br.durex.maratonaJava.core.lambdas.dominio.Anime;
import com.br.durex.maratonaJava.core.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>(List.of("Rimuru", "Velnora", "Hikimaro"));
       list.sort(String::compareTo);
       System.out.println(list);

       Function<String, Integer> numStringToInteger = Integer::parseInt;
       Integer num = numStringToInteger.apply("18");
       System.out.println(num);
    }
}
