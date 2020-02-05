package com.mainacad;

public class PetMaster {

    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Meow!Meow!!");
        System.out.println(petReaction);
        myPet.sleep();
        System.out.println("");

        Fish myLittleFish = new Fish();

        myLittleFish.say("Hi");

        System.out.println("");

        myLittleFish.dive(2);
        myLittleFish.dive(97);
        myLittleFish.dive(3);

        myLittleFish.sleep();
    }
}
