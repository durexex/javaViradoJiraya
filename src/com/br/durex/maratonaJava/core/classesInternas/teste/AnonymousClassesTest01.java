package com.br.durex.maratonaJava.core.classesInternas.teste;

class Animal {
    public void walk() {
        sout("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
          @Override
          public void walk() {
              System.out.println("Walking in the shadwsp");
          }
        };

        animal.walk();
    }
}
