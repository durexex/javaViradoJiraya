package com.br.durex.maratonaJava.core.generics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Const cão");
    }
}


class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Const gato");
    }
}


public class WildcardsTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(gatos);


    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
