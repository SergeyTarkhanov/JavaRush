package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandpa1 = new Human("Александр", true, 85, null, null);
        Human grandpa2 = new Human("Иван", true, 80, null, null);
        Human grandma1 = new Human("Нина", false, 80, null, null);
        Human grandma2 = new Human("Надя", false, 75, null, null);
        Human father = new Human("Анатолий", true, 48, grandpa2, grandma2);
        Human mother = new Human("Алла", false, 48, grandpa1, grandma1);
        Human child1 = new Human("Евгений", true, 26, father, mother);
        Human child2 = new Human("Ольга", false, 29, father, mother);
        Human child3 = new Human("Алиса", false, 9, father, mother);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString ()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
