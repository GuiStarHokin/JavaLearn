public class Tutorial {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        System.out.print("Hello world!");
        System.out.print("I will print on the same line.");
        System.out.println();
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        // This is a comment
        System.out.println("Hello World!");
        /* The code below will print the words Hello World
to the screen, and it is amazing */
        System.out.println("Hello World");

        /*
        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

        Final Variables
        If you don't want others (or yourself) to overwrite existing values, use the final keyword
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
        */

        String name = "John";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);

        int myNum_2;
        myNum_2 = 16;
        System.out.println(myNum_2);

        final int myNum_3 = 20;
        // myNum_3 = 21;

        int myNum_4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("Hello" + name);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        // int z = 7, u = 8, v = 9;
        // System.out.println(z + u + v);

        int z, u, v;
        z = u = v = 50;
        System.out.println(z + u + v);

        /*
        Data types are divided into two groups:
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes
        */

        double myDouble = 1.1d;
        float myFloat = 1.1f;
        System.out.println(myDouble + myFloat);

        double f1 = 5e2d;
        System.out.println(f1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int myInt = 9;
        myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        myDouble = 9.78d;
        myInt = (int)myDouble;
        System.out.println(myInt);
        System.out.println(myDouble);

        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;

        x = 5;
        y = 3;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x != y);
        System.out.println(x == y);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        System.out.println("The length of the txt string is:" + txt.length());

        txt = "Hello World!";
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.concat(" " + lastName));

        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 101));

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        if (x > y) {
            System.out.println("X is greater than Y");
        }

        int time = 22;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String j : cars) {
            System.out.println(j);
        }


        int[] myint = {10, 20, 30, 40};

        for (int j = 0; j < myint.length; j++) {
            System.out.println(myint[j]);
        }

        for (int k : myint) {
            System.out.println(k);
        }


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }


    }
}