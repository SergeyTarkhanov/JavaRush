package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> setList = new HashSet<String>();
        setList.add("Лом");
        setList.add("Лайк");
        setList.add("ласка");
        setList.add("литр");
        setList.add("любовь");
        setList.add("лассо");
        setList.add("лук");
        setList.add("луч");
        setList.add("луг");
        setList.add("лекарство");
        setList.add("ложка");
        setList.add("линк");
        setList.add("леска");
        setList.add("линейка");
        setList.add("лейка");
        setList.add("лицо");
        setList.add("ловушка");
        setList.add("лиана");
        setList.add("Лена");
        setList.add("лестница");

        return  setList;

    }
}
