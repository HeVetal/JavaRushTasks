package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
        if (types == (ImageTypes.JPG)) {
            return new JpgReader();
        } else if (types == (ImageTypes.PNG)) {
            return new PngReader();
        } else if (types == (ImageTypes.BMP)) {
            return new BmpReader();
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
