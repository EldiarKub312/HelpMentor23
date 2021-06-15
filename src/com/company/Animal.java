package com.company;

public class Animal {
    private int age;
    private String breed, color, voice;

    public Animal(int age, String breed, String color, String voice) {
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.voice = voice;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getInfo() {
        return "Age:" + age + " color:" + color + " Breed:" + breed + " voice:" + voice;
    }
}
