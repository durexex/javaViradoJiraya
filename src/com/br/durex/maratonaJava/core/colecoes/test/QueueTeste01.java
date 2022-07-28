package com.br.durex.maratonaJava.core.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String s : fila) {
            System.out.println(s);
        }
        System.out.println("**************************************");
        System.out.println(fila);
        System.out.println("**************************************");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
