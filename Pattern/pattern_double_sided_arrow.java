package Pattern;

public class pattern_double_sided_arrow {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = 1;
        int space = n-1;
        int space2 = -1;
        int val = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print(val + "\t");
                val--;
                j++;
            }
            int l = 1;
            while(l<=space2){
                System.out.print("\t");
                l++;
            }
            val++;
            int k = 1;
            while(k<=star){
                if(row==1 || row==n){
                    val++;
                    k++;
                }
                else{
                    System.out.print(val + "\t");
                    val++;
                    k++;
                }
            }
            if(row<=n/2){
                star++;
                space -= 2;
                space2 += 2;
            }
            else{
                val -= 2;
                star--;
                space += 2;
                space2 -= 2;
            }
            row++;
            System.out.println();
        }
    }
}
