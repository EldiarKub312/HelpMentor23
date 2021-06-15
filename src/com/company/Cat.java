package com.company;

public class Cat extends Animal {
    private final int num = 12; // не меняемая константа

    private int lives;

    public Cat(int age, String breed, String color, String voice, int Lives) {
        super(age, breed, color, voice);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }
    @Override
    public String getInfo() {
        System.out.println("Был вызван медот getInfo() у Кошки");
        return super.getInfo()+lives;
    }
}
