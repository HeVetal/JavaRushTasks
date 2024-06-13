package com.javarush.task.task31.task3110;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        ZipOutputStream zipOutputStream = (ZipOutputStream) Files.newOutputStream(source);
        ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
        zipOutputStream.putNextEntry(zipEntry);

    }
}
