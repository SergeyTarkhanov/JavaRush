package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) list.add(data[i]);
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            //Integer x = list.get(i);
            if (list.get(i)% 2 == 0)
                even.add(list.get(i));
            else
                odd.add(list.get(i));
        }
    }
}