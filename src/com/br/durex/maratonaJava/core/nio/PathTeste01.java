package com.br.durex.maratonaJava.core.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Temp\\file.txt");
        System.out.println(p1.getFileName());
    }
}
