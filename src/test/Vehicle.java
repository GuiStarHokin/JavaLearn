package test;

public class Vehicle {
    protected int x = 10;
    public void honk() {
        System.out.println("In Vehicle class");
    }

}

class Vehicle_t extends Vehicle {
    private int y = 20;
    public static void main(String[] args) {
        Vehicle_t myObj = new Vehicle_t();
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        myObj.honk();
    }

}