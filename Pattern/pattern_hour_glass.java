package Pattern;

public class pattern_hour_glass {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;
        int val = n;
        while(row<=2*n+1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print(val + " ");
                j++;
                val--;
            }
            System.out.print(val + " ");
            val++;
            int k = 1;
            while(k<=star){
                System.out.print(val + " ");
                k++;
                val++;
            }
            if(row<=n){
                star--;
                space++;
                val -= 2;
            }
            else{
                star++;
                space--;
            }
            row++;
            System.out.println();
        }
    }
}
