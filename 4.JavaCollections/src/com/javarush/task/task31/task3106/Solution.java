package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        if (file.exists()) {
            file.createNewFile();
        }
        Set<String> setArgs = new TreeSet<>();
        for (int i = 1; i < args.length; i++) {
            setArgs.add(args[i]);
        }
        List<InputStream> listStream = new ArrayList<>();
        for (String setArg : setArgs) {
            try {
                listStream.add(new FileInputStream(setArg));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        try (ZipInputStream zis = new ZipInputStream(new SequenceInputStream(Collections.enumeration(listStream)))) {
            while (true) {
                ZipEntry entry = zis.getNextEntry();
                if (entry == null) {
                    break;
                }
                try (OutputStream os = new BufferedOutputStream(new FileOutputStream(file))){
                    final int bufferSize = 1024;
                    byte[] buffer = new byte[bufferSize];
                    for (int readBytes; (readBytes = zis.read(buffer, 0, bufferSize)) > -1; ) {
                        os.write(buffer, 0, readBytes);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
