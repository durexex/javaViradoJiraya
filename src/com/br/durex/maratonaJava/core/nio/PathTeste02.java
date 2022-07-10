package com.br.durex.maratonaJava.core.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");

        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path subPastaàth = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaàth);

    }
}
