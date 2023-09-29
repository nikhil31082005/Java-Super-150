package Lec1;

public class Inc_Dec {
    public static void main(String[] args) {
        int a = 9;
        int x = a++ + 8 + a-- - --a + --a + ++a;
        System.out.println(x);
    }
}