package Pattern;

public class pattern_mountain {
    public static void main(String[] args) {
        int n = 6;
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while(row<=n){
            int val = 1;
            int i = 1;
            while(i<=star){
                System.out.print(val + "\t");
                val++;
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int k = 1;
            while(k<=star){
                val--;
                if(row==n && k==1){
                    val--;
                    k++;
                }
                System.out.print(val + "\t");
                k++;
            }
            star++;
            space -= 2;
            row++;
            System.out.println();
        }
    }
}
