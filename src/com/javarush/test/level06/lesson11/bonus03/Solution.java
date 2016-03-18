package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(reader.readLine());

        }

        for (int k = arr.length - 1; k >= 0; k--) {

            for(int l = 0; l < k; l++) {

                if (arr[l] > arr[l + 1]) {
                    int tmp = arr[l];
                    arr[l] = arr[l + 1];
                    arr[l + 1] = tmp;
                }
            }

        }

        for (int e : arr) {
            System.out.println(e);

        }
    }
}
