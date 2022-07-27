package com.br.durex.maratonaJava.core.colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklaco", "teclado");
        map.put("voçê", "você");
        map.put("vossê", "você");

        map.putIfAbsent("voçê", "você");

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
