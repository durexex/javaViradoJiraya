package com.br.durex.maratonaJava.core.datas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIn = new Locale("hi", "IN");
        Locale localeJp = new Locale("ja", "JP");


        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIn);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJp);


        System.out.println(localeItaly.getDisplayCountry() + " " + df1.format(calendar.getTime()));
        System.out.println(localeCH.getDisplayCountry() + " " + df2.format(calendar.getTime()));
        System.out.println(localeIn.getDisplayCountry() + " " + df3.format(calendar.getTime()));
        System.out.println(localeJp.getDisplayCountry() + " " +  df4.format(calendar.getTime()));

        System.out.println();

    }
}
