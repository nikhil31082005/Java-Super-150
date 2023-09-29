package Lec3;

public class pattern_14 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            space--;
            star++;
            System.out.println();
        }
        space += 2;
        star -= 2;
        while(row<=2*n-1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            space++;
            star--;
            row++;
            System.out.println();
        }

    }
}
