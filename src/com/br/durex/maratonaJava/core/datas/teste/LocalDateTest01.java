package com.br.durex.maratonaJava.core.datas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2021, Month.JANUARY, 30);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.isLeapYear());
        System.out.println(date);

        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        LocalDate mesQueVem = agora.plusWeeks(4);

        System.out.println(mesQueVem);
    }
}
