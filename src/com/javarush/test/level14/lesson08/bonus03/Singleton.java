package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Джек on 01.08.2015.
 */
public class Singleton {
    private static Singleton s;


    private Singleton() {

    }

    public synchronized static Singleton getInstance(){
        if (s == null)
          s = new Singleton();
        return s;
    }
}
