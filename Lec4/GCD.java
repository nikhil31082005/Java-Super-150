package Lec4;

public class GCD {
    public static void main(String[] args) {
        int a = 60;
        int b = 36;
        int gcd = 1;
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
