package Lec1;

public class digit_sum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 2345;
        while(n>0){
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        System.out.println(sum);
    }
}
