package com.br.durex.maratonaJava.core.datas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
