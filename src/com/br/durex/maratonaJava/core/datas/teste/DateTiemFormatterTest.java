package com.br.durex.maratonaJava.core.datas.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTiemFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String d1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String d2 = date.format(DateTimeFormatter.ISO_DATE);
        String d3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        LocalDate parse1 = LocalDate.parse("20220219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-02-19", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-02-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

    }
}
