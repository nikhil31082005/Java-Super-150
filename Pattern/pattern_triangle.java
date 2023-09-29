package Pattern;

public class pattern_triangle {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n - 1;
        int star = 1;
        while(row<=n){
            int val = row;
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int i = 1;
            while(i<=star){
                if(i<=star/2){
                    System.out.print(val + "\t");
                    val++;
                }
                else{
                    System.out.print(val + "\t");
                    val--;
                }
                i++;
            }
            star += 2;
            space--;
            row++;
            System.out.println();
        }
    }
}
