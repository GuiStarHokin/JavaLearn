package test;

class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 10;
        public int InnerMethod() {
            return x + y;
        }
    }
}

public class Main_3 {
    public static void main(String[] args) {
        OuterClass myOutObj = new OuterClass();
        OuterClass.InnerClass myInObj = myOutObj.new InnerClass();
        System.out.println(myInObj.InnerMethod());
        System.out.println(myInObj.y);
        System.out.println(myOutObj.x);
    }
}