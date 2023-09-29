package Pattern;

public class hollow_diamond_pattern {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int space = -1;
        int star = n;
        while(row<=2*n-1){
            int i = 1;
            while(i<=star){
                System.out.print("*\t");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int k = 1;
            while(k<=star){
                if((row==1 || row==2*n-1) && k==1){
                    k++;
                }
                System.out.print("*\t");
                k++;
            }
            if(row<n){
                star--;
                space += 2;
            }
            else{
                star++;
                space -= 2;
            }
            row++;
            System.out.println();
        }
    }
}