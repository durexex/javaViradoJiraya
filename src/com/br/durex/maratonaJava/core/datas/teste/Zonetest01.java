package com.br.durex.maratonaJava.core.datas.teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class Zonetest01 {
    public static void main(String[] args) {
        Map<String,String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokio = ZoneId.of("Asia/Tokyo");

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        ZonedDateTime zoneDateTime = now.atZone(tokio);
        System.out.println(zoneDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zoneDateTime2 = nowInstant.atZone(tokio);
        System.out.println(zoneDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetManaus);

        OffsetDateTime offsetDateTime3 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaDate);


    }
}
