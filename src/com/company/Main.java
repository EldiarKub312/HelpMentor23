package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(12 , "Pushistik" ,"Black" , "Салам Алейкум" ,34);
        System.out.println(cat.getInfo());

        Dog dog = new Dog(15 ,"Ak tow" ,"Black" ,"Гав-гав", "23");
        System.out.println(dog.getInfo());
    }
}
