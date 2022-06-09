package com.br.durex.maratonaJava.core.interfaces.dominio;

public interface DataLoader {


    public static final int MAX_SIZE = 10;

    public abstract void load();

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro da interface");
    }
}
