package Lec3;

public class pattern_25 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n - 1;
        int val = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(val +"\t");
                val++;
                j++;
            }
            // next row Prep
            System.out.println();
            row++;
            star += 2;
            space--;
        }
    }
}
