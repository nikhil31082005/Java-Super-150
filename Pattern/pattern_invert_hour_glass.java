package Pattern;

public class pattern_invert_hour_glass {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int star = 1;
        int space = 2*n-1;
        while(row<=2*n+1){
            int val = n;
            int i = 1;
            while(i<=star){
                System.out.print(val + "\t");
                i++;
                val--;
            }
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int k = 1;
            while(k<=star){
                if(row==n+1 && k==1){
                    val++;
                    k++;
                }
                val++;
                System.out.print(val + "\t");
                k++;
            }
            if(row<=n){
                star++;
                space -= 2;
            }
            else{
                star--;
                space += 2;
            }
            row++;
            System.out.println();
        }
    }
}
