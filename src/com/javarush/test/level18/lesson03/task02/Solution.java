package com.javarush.test.level18.lesson03.task02;

import java.io.*;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path = br.readLine();
        File file = new File(path);

        InputStream is = new FileInputStream(file);

        int oneByte = is.read();
        int minByte = oneByte;

        while (is.available() != 0){

            oneByte = is.read();

            if(minByte > oneByte) minByte = oneByte;

        }

        System.out.println(minByte);

        is.close();
    }
}
