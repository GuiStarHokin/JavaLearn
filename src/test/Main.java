package test;


public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cow myCow = new Cow();
        Pig myPig = new Pig();
        myAnimal.animalSound();
        myCow.animalSound();
        myPig.animalSound();
    }

}

class Animal {
    public void animalSound() {
        System.out.println("Animal Sound");
    }
}

class Cow extends Animal {
    public void animalSound() {
        System.out.println("Cow say");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig say");
    }
}