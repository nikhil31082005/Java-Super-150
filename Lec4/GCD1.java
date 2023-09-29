package Lec4;

public class GCD1 {
    public static void main(String[] args) {
        int dividend = 60;
        int divisor = 36;
        while(dividend % divisor != 0){
            int r = dividend % divisor;
            dividend = divisor;
            divisor = r;
        }
        System.out.println(divisor);
    }
}