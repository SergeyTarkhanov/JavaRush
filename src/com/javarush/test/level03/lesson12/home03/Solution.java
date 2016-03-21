package com.javarush.test.level03.lesson12.home03;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{


    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        String sNumber = reader.readLine();
        int n = Integer.parseInt(sNumber);

        System.out.print("Я буду зарабатывать $" + n + " в час");
    }
}