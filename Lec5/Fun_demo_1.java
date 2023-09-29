package Lec5;

public class Fun_demo_1 {
    public static void main(String[] args) {
        System.out.println("Hey");
        int c = add();
        System.out.println(c);
    }
    public static int add(){
        int a = 9;
        int b = 7;
        sub();
        return a+b;
    }
    public static void sub(){
        int a = 9;
        int b = 7;
        System.out.println(a-b);
    }
}
