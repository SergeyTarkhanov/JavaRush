package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
    public static HashMap<String, String> createMap()
    {
       HashMap<String, String> people = new HashMap();
        people.put("Иванов","Иван");
        people.put("Петров","Петр");
        people.put("Лужков","Андрей");
        people.put("Шварц","Петр");
        people.put("Порох","Петр");
        people.put("Яцык","Сеня");
        people.put("Пастор","Кровавый");
        people.put("Тимоха","Юлька");
        people.put("Янык","Витя");
        people.put("Ющ","Витя");

        return people;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            for (Map.Entry<String, String> pair2: map.entrySet()) {

                if (pair.getValue().equals(pair2.getValue()))
                    removeItemFromMapByValue(map,pair2.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
