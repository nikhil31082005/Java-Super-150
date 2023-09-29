package Lec4;

public class bin_to_dec {
    public static void main(String[] args) {
        int n = 101100;
        int multiplier = 1;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            sum = sum + r * multiplier;
            n = n / 10;
            multiplier = multiplier * 2;
        }
        System.out.print(sum);
    }
}
