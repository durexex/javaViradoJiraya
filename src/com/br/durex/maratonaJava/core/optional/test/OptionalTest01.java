package com.br.durex.maratonaJava.core.optional.test;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Alllo");
        Optional<String> o2 = Optional.ofNullable("Alllo");
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> nameOptional = findName("William");
        System.out.println(nameOptional);
    }

    private static Optional<String> findName(String name) {
        List<String> lista = List.of("William", "DevDojo");
        int i = lista.indexOf(name);
        if (i >= 0) {
            return Optional.of(lista.get(i));
        }

        return Optional.empty();
    }
}
