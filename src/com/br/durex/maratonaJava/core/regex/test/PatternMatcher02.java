package com.br.durex.maratonaJava.core.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher02 {
    public static void main(String[] args) {
        // \d dítitos
        // \D tudo que não for dítitos
        // \s Espaços em branco \t \n \f \r
        // \S Todos caracteres excluindo os brancos
        // \w tudo que for a..z ou A..Z, dígiots e _
        // \W tudo que não for a..z ou A..Z, dígiots e _

        String regex = "\\W";
        String texto = "12_3aeEE &&&";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(texto);

        System.out.println("texto " + texto);
        System.out.println("Índice: " + "123456789");
        System.out.println("regex " + regex);
        while (match.find()) {
            System.out.print(match.start() + " " + match.group() + "\n");
        }
    }
}
