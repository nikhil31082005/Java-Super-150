package Lec1;

public class reverse_num {
    public static void main(String[] args) {
        int n = 33867;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            sum = sum*10 + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
