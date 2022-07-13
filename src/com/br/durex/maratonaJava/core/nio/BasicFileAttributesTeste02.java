package com.br.durex.maratonaJava.core.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTeste02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta/novo.txt");
        BasicFileAttributes basicFileAttribute = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttribute.creationTime();
        FileTime lastModifiedTime = basicFileAttribute.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttribute.lastAccessTime();

        System.out.println("creation time " + creationTime);
        System.out.println("last modified time " + lastModifiedTime );
        System.out.println("lastAccess time " + lastAccessTime);




    }
}
