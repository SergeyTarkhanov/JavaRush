package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private int age;
        private String name;
        private int high;
        private String sex;
        private  boolean marriage;
        private String nationality;


        public Human(int age) {
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean marriage) {
            this.marriage = marriage;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, String name, int high) {
            this.age = age;
            this.name = name;
            this.high = high;
        }

        public Human(int age, String name, int high, String sex) {
            this.age = age;
            this.name = name;
            this.high = high;
            this.sex = sex;
        }

        public Human(int age, String name, int high, String sex, boolean marriage) {
            this.age = age;
            this.name = name;
            this.high = high;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(int age, String name, int high, String sex, boolean marriage, String nationality) {
            this.age = age;
            this.name = name;
            this.high = high;
            this.sex = sex;
            this.marriage = marriage;
            this.nationality = nationality;
        }

        public Human(int age, String name, boolean marriage) {
            this.age = age;
            this.name = name;
            this.marriage = marriage;
        }

        public Human(String name, boolean marriage, String nationality) {
            this.name = name;
            this.marriage = marriage;
            this.nationality = nationality;
        }
    }
}
