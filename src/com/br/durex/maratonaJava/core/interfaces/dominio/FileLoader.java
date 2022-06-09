package com.br.durex.maratonaJava.core.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("updando saporra.............. cri cri cri");

    }

    @Override
    public void remove() {
        System.out.println("Deleting files ...... :(");
    }
}
