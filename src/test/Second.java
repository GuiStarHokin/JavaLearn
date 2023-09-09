/*
package test;

public class Second {
    public static void main(String[] args) {
        Main.Student myObj = new Main.Student();
        System.out.println(myObj.age);
        myObj.testPrint();
        System.out.println(myObj.thirdObj.modelX);
        System.out.println(myObj.name);
        System.out.println(myObj.graduationYear);
        myObj.study();
    }
}*/


package test;

import java.util.Scanner;
public class Second {
    public static void main (String[] args) {
        /*
        Main.Student myObj = new Main.Student();
        System.out.println(myObj.name + " is " + myObj.age +" age in " + myObj.grade + " grade");
        myObj.study();
        myObj.sleep();
         */

        /*
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println(myObj.getName());
         */
        Scanner sc = new Scanner(System.in);
        int myNum;
        boolean flag = true;
        while (flag) {
            myNum = sc.nextInt();
            System.out.println(myNum);
            if (myNum == 0) {
                flag = false;
                sc.nextLine(); // 吸收\n
            }
        }

        System.out.println("Please Enter Username:");
        String name = sc.nextLine();
        System.out.println("Your Username is :" + name);
    }
}