package com.br.durex.maratonaJava.core.interfaces.teste;

import com.br.durex.maratonaJava.core.interfaces.dominio.DatabaseLoader;
import com.br.durex.maratonaJava.core.interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        fileLoader.checkAuth();

    }
}
