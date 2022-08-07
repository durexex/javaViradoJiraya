package com.br.durex.maratonaJava.core.generics.test;

import com.br.durex.maratonaJava.core.generics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canaloa"));
    }

    private static <T> List<T>  criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

}
