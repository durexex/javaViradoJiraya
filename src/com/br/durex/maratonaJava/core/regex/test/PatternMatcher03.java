package com.br.durex.maratonaJava.core.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher03 {
    public static void main(String[] args) {
        // \d dítitos
        // \D tudo que não for dítitos
        // \s Espaços em branco \t \n \f \r
        // \S Todos caracteres excluindo os brancos
        // \w tudo que for a..z ou A..Z, dígiots e _
        // \W tudo que não for a..z ou A..Z, dígiots e _
        // []

        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0XFFABC 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(texto);

        System.out.println("texto " + texto);
        System.out.println("regex " + regex);
        while (match.find()) {
            System.out.print(match.start() + " " + match.group() + "\n");
        }
    }
}
