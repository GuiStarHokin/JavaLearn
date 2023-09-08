public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Phone myPhone2 = new Phone();
        Man my = new Man();
        myPhone2.color = "White";
        my.age = 20;
        System.out.println("My Name is" + " " + my.lastName + my.firstName + " have " + myPhone.color + " Phone ," + " age is " + my.age);
        my.age = 25;
        System.out.println("My Name is " + my.lastName + my.firstName + " have " + myPhone2.color + " Phone ," + " age is " + my.age);

    }
}