package com.br.durex.maratonaJava.core.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data...");
    };

    @Override
    public void remove() {
        System.out.println("Removing data...");
    }

}
