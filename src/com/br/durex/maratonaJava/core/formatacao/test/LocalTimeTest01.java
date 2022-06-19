package com.br.durex.maratonaJava.core.formatacao.test;

import java.time.LocalTime;
import java.time.Period;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(23, 32, 12);

        System.out.println(hora);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
