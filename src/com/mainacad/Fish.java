package com.mainacad;

public class Fish extends Pet{

    int currentDepth=0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;

        if (currentDepth > 100) {
            System.out.println("I'm little fish and I cant swim dipper than 100 meters");
            currentDepth = currentDepth - howDeep;
        } else  {
            System.out.println("Diving on the depth " + howDeep + " meters");
            System.out.println("I'm on the depth " + currentDepth + " meters below sea level");
        }
        return currentDepth;
    }

    String somethingElse = null;

    public String say(String something) {
        somethingElse = "Don't you that fish doesn't talk!";
        System.out.println(somethingElse);
        return somethingElse;
    }
}
