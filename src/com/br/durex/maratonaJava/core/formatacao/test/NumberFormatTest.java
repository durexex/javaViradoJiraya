package com.br.durex.maratonaJava.core.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localeIT);
        nf[2] = NumberFormat.getInstance(localeJP);
        nf[3] = NumberFormat.getInstance(localePT);

        double valor = 10_000.2125;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
