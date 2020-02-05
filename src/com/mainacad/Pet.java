package com.mainacad;

public class Pet {

    int age;
    float weight;
    float height;
    String color;

    public void sleep() {
        System.out.println("Good night! See you tomorrow!");
    }

    public void eat() {
        System.out.println("I'm really hungry, let's eat some chips!");
    }

    public String say(String aWord) {
        String petResponse = "Okey!!" + aWord;
        return petResponse;
    }
}
