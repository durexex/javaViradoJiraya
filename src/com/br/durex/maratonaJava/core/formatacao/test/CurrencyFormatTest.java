package com.br.durex.maratonaJava.core.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatTest {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeIT);
        nf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nf[3] = NumberFormat.getCurrencyInstance(localePT);

        double valor = 10_000.2125;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
