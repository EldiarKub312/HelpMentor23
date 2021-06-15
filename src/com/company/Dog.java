package com.company;

public class Dog extends Animal {


    private String commands;

    public Dog(int age, String breed, String color, String voice, String commands) {
        super(age, breed, color, voice);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;

    }
    @Override
    public String getInfo() {
        System.out.println("Был вызван медот getInfo() у Собаки");
        return super.getInfo() + " Command: " + commands;
    }
}
