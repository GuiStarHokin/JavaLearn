public class PublicAndStatic {
    public void myPublicMethod() {
        System.out.println("In public class myPublicMethod()");
    }

    static void myStaticMethod() {
        System.out.println("In public class myStaticMethod()");
    }

    public static void main(String[] args) {
        myStaticMethod();
    }
}
