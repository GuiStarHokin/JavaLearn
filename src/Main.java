public class Main {
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public static void main(String[] args) {
        /*
        Phone myPhone = new Phone();
        Phone myPhone2 = new Phone();
        Man my = new Man();
        myPhone2.color = "White";
        my.age = 20;
        System.out.println("My Name is" + " " + my.lastName + my.firstName + " have " + myPhone.color + " Phone ," + " age is " + my.age);
        my.age = 25;
        System.out.println("My Name is " + my.lastName + my.firstName + " have " + myPhone2.color + " Phone ," + " age is " + my.age);
        myStaticMethod();
        Main myObject = new Main();
        myObject.myPublicMethod();
        PublicAndStatic publicAndStatic = new PublicAndStatic();
        publicAndStatic.myPublicMethod();
        myStaticMethod();
         */

        Constructor con = new Constructor(10, "Well");
        System.out.println(con.modelX);
        System.out.println(con.modelName);

    }
}