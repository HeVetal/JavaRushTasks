package com.javarush.task.jdk13.task42;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\IdeaProjects\\JavaRushTasks\\3.JavaMultithreading\\src\\com\\javarush\\task\\jdk13\\task42";
        Files.walkFileTree(Path.of(path), new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if(file.toString().endsWith(".md")){
                    Path parent = file.getParent();
                    Path resolve = parent.resolve("Условие.md");
                    Files.move(file,resolve);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
