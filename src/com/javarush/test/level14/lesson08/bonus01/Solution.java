package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] arr = new int [1];
            System.out.println(arr[1]);


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
           String s = "mama";
            int a = Integer.parseInt(s);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Socket socket = new Socket("127.11.0.1", 999);


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Socket socket = new Socket("127.0.0.1", 99999999);


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            StringBuilder ref = null;
            ref.toString();
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            InputStreamReader in = new InputStreamReader(new URL("").openStream());
            in.read();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            FileInputStream in = new FileInputStream(new File(""));
            in.read();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here

    }
}
