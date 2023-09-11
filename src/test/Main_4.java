package test;

abstract class Animal_2 {
    int x = 10;
    public abstract void animalSound();
    public void sleep() {
        System.out.println("zzZZ");
    }
}

class Pig_2 extends Animal_2 {
    int y = 15;
    public void animalSound() {
        System.out.println("Pig Say");
    }
}

public class Main_4 {
    public static void main(String[] args) {
        Pig_2 myPig = new Pig_2();
        System.out.println(myPig.x + myPig.y);
        myPig.animalSound();
        myPig.sleep();

    }
}