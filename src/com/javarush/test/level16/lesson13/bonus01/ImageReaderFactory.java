package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Vorobiei on 21.03.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes imgType)
    {

        if (imgType == ImageTypes.JPG)
        {
            return new JpgReader();
        }
        else if (imgType == ImageTypes.BMP)
        {
            return new BmpReader();
        }
        else if (imgType == ImageTypes.PNG)
        {
            return new PngReader();
        }
        else
        {
            throw  new  IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
