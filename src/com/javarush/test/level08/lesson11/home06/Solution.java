package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human child1 = new Human("Евгений", true, 26, new ArrayList<Human>());
        Human child2 = new Human("Ольга", false, 29, new ArrayList<Human>());
        Human child3 = new Human("Алиса", false, 9, new ArrayList<Human>());
        ArrayList<Human> childrenArray = new ArrayList<Human>();
        childrenArray.add(child1);
        childrenArray.add(child2);
        childrenArray.add(child3);
        Human father = new Human("Анатолий", true, 48, childrenArray);
        Human mother = new Human("Алла", false, 48, childrenArray);
        ArrayList<Human> parent1 = new ArrayList<Human>();
        ArrayList<Human> parent2 = new ArrayList<Human>();
        parent1.add(father);
        parent2.add(mother);
        Human grandpa1 = new Human("Александр", true, 85, parent2);
        Human grandpa2 = new Human("Иван", true, 80, parent1);
        Human grandma1 = new Human("Нина", false, 80,parent2);
        Human grandma2 = new Human("Надя", false, 75, parent1);




        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private  boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
