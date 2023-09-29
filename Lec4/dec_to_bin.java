package Lec4;

public class dec_to_bin {
    public static void main(String[] args) {
        int num = 300;
        int base = 2;
        int ans = 0;
        int multiplier = 1;
        while(num>0){
            int r = num % base;
            ans = ans + r * multiplier;
            num = num / base;
            multiplier *= 10;
        }
        System.out.print(ans);
    }
}
