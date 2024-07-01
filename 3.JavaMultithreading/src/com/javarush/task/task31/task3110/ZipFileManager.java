package com.javarush.task.task31.task3110;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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

    public void createZip(Path source) throws Exception {;
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile.toAbsolutePath()))) {
            addNewZipEntry(zipOutputStream,source.getParent(),source.getFileName());
        }
    }

    private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) throws Exception{
        byte[] buffer;
        try (InputStream inputStream = Files.newInputStream(fileName)) {
            ZipEntry zipEntry = new ZipEntry(fileName.toString());
            zipOutputStream.putNextEntry(zipEntry);
            buffer = new byte[inputStream.available()];
        }
        zipOutputStream.write(buffer);
        zipOutputStream.closeEntry();
    }

    private void copyData(InputStream in, OutputStream out) throws Exception{
        while (in.available() > 0){
            out.write(in.readAllBytes());
        }
    }
}
