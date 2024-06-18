package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        ZipOutputStream zipOutputStream = (ZipOutputStream) Files.newOutputStream(source);
        ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
        zipOutputStream.putNextEntry(zipEntry);
        InputStream inputStream = Files.newInputStream(source,CREATE_NEW);
        while (inputStream.markSupported()){
            zipOutputStream.write(inputStream.read());
        }



    }
}
