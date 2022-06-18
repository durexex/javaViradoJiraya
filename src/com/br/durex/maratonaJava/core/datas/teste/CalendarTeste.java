package com.br.durex.maratonaJava.core.datas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Date data = c.getTime();
        System.out.println(data);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Várzea");
        }
    }
}
