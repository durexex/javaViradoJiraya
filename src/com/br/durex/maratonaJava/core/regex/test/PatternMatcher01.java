package com.br.durex.maratonaJava.core.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaababbabaaabaababababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(texto);

        System.out.println("texto " + texto);
        System.out.println("Índice: " + "123456789");
        System.out.println("regex " + regex);
        while (match.find()) {
            System.out.print(match.start() + " ");
        }
    }
}
