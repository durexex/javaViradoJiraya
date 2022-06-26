package com.br.durex.maratonaJava.core.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher04 {
    public static void main(String[] args) {
        // \d dítitos
        // \D tudo que não for dítitos
        // \s Espaços em branco \t \n \f \r
        // \S Todos caracteres excluindo os brancos
        // \w tudo que for a..z ou A..Z, dígiots e _
        // \W tudo que não for a..z ou A..Z, dígiots e _
        // []
        // ? Zero ou uma ocorrência
        // * zero ou mais ocorrências
        // + uma ou mais ocorrências
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $ representa o fim da linha
        // . 1.3  qualquer coisa que comece com 1 e termine com 3 tendo tamanho 3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0XFFABC 0X10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(texto);

        System.out.println("texto " + texto);
        System.out.println("regex " + regex);
        while (match.find()) {
            System.out.print(match.start() + " " + match.group() + "\n");
        }
    }
}
