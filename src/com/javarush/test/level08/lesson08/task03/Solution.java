package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Ольга"));
        System.out.println(getCountTheSameLastName(map, "Воробей"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Воробей","Евгений");
        map.put("лазебник","Ольга");
        map.put("Воробей","Алла");
        map.put("Лазебник","Мирослава");
        map.put("Логинов","Сергей");
        map.put("Логинов","Александр");
        map.put("Сницар","Нина");
        map.put("Логинова","Юлия");
        map.put("Логинов","Генадий");
        map.put("Лазебник","Ярослав");

        return map;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (Map.Entry<String, String> value: map.entrySet()) {

            if (value.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count2 = 0;

        for (Map.Entry<String, String> key: map.entrySet()) {
            if (key.getKey().equals(familiya))
                count2++;
        }
        return count2;

    }
}
