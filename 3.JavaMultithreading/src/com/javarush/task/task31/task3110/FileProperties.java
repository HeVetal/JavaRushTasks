package com.javarush.task.task31.task3110;

public class FileProperties {

    private String name;
    private long size;
    private long compressedSize;
    private int compressionMethod;

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public long getCompressedSize() {
        return compressedSize;
    }

    public int getCompressionMethod() {
        return compressionMethod;
    }

    public long getCompressionRatio() {
        return 100 - ((compressedSize * 100) / size);
    }

    @Override
    public String toString() {
        if (size < 0) {
            return name;
        }
        return name + " " + size / 1024 +
                ", compressedSize=" + compressedSize +
                ", compressionMethod=" + compressionMethod +
                '}';
    }
}
