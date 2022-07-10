package com.br.durex.maratonaJava.core.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            if (file.exists()) {
                boolean isDeleted = file.delete();
                System.out.println("deleted " + isDeleted);
            }
            boolean iscreated = file.createNewFile();
            System.out.println("Is created " + iscreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
