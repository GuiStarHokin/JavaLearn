/* 方法和参数
public class MethodsLearn {

    static void myMethod(String fname, int age) {
        System.out.println(fname + " " + "is" + " " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
*/

/* 方法和重载
public class MethodsLearn {
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMehotd(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMehotd(3.14, 2.4);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
*/

/* 递归1
public class MethodsLearn {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = sum(100);
        System.out.println(result);
    }
}*/

public class MethodsLearn {
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
}