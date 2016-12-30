package com.javarush.test.level18.lesson03.task01;

import java.io.*;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path = br.readLine();
        File file = new File(path);

        InputStream is = new FileInputStream(file);

        int oneByte = is.read();
        int maxByte = oneByte;

        while ((oneByte = is.read()) != -1){
            if(maxByte < oneByte) maxByte = oneByte;

        }

        System.out.println(maxByte);

        is.close();
    }
}
