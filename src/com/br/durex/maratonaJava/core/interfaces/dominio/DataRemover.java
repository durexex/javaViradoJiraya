package com.br.durex.maratonaJava.core.interfaces.dominio;

public interface DataRemover {

    public abstract void remove();

    default void checkAuth() {
        System.out.println("Olho em ti");
    }
}
