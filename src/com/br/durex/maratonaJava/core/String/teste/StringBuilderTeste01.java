package com.br.durex.maratonaJava.core.String.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Fulanis";
        nome.concat(" curso");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        sb.append("méeeeeeeeeeeee");
        sb.append(" ihhhhhhhhhhh").append(" caracas");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
