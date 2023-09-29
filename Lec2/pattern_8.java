package Lec2;

public class pattern_8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=n){
                if(i==row || i+row==n+1){
                    System.out.print("* ");
                    i++;
                }
                else{
                    System.out.print("  ");
                    i++;
                }
            }
            row++;
            System.out.println();
        }
    }
}
