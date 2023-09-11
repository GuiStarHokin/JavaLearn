/*
package test;

public abstract class Main {
    public String name = "John";
    public int age = 21;
    public abstract void study();
    public void testPrint() {
        System.out.println("This is testPrint");
    }
    Third thirdObj = new Third(10);
    public static class Student extends Main {
        public int graduationYear = 2018;
        public void study() {
            System.out.println("Study all day long");
        }
    }
}*/



package test;

public abstract class Main_2 {
    String name = "John";
    int age = 20;
    public abstract void study();
    public void sleep() {
        System.out.println("I'm going to bed now!");
    }

    public static class Student extends Main_2 {
        public int grade = 3;
        @Override
        public void study() {
            System.out.println("Override study");
        }

    }
}
