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
        try (ZipOutputStream zip = (ZipOutputStream) Files.newOutputStream(zipFile)) {
            ZipEntry zipEntry = new ZipEntry(String.valueOf(source.getFileName()));
            zip.write(zipEntry.getMethod());
        }
    }
}
