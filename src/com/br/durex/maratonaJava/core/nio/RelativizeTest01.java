package com.br.durex.maratonaJava.core.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/durex");
        Path clazz = Paths.get("/home/durex/dev/olaMundo.java");


        Path pathToClass = dir.relativize(clazz);
        System.out.println(pathToClass);
    }
}
