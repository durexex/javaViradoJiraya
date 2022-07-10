package com.br.durex.maratonaJava.core.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Estudando no sábado a noite. ");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
