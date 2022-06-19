package com.br.durex.maratonaJava.core.formatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "yyyy.HH.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat();

        System.out.println(sdf.format(new Date()));

    }
}
