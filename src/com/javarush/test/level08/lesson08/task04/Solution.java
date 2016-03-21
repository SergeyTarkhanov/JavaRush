package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Шварцнегер", new Date("MAY 5 1993"));
        map.put("Дикаприо", new Date("APRIL 27 1985"));
        map.put("Питт", new Date("APRIL 13 1977"));
        map.put("Джоли", new Date("APRIL 13 1977"));
        map.put("Камерон", new Date("MAY 13 1977"));
        map.put("Ридли", new Date("APRIL 13 1977"));
        map.put("Лазебник", new Date("JUNE 13 1977"));
        map.put("Воробей", new Date("APRIL 13 1977"));
        map.put("Круг", new Date("MAY 13 1977"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }

    }
}
