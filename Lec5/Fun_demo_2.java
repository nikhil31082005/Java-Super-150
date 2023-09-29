package Lec5;

public class Fun_demo_2 {
    static int val = 100;   // heap
    public static void main(String[] args) {
        System.out.println("Hey");
        int a = 8;
        int b = 7;
        System.out.println(val);
        System.out.println(add(a,b));
        System.out.println(val);
    }
    public static int add(int a,int b){
        int c = a + b;
        int x = sub(a,c);
        int val = 90;   // local
        Fun_demo_2.val = Fun_demo_2.val+5;
        return x + c;
    }
    public static int sub(int a,int b){
        return a - b;
    }
}
