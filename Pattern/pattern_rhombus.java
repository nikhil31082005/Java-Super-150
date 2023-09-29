package Pattern;

public class pattern_rhombus {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        int val = 1;
        while(row<=2*n-1){
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while(j<=star){
                if(j<=star/2){
                    System.out.print(val+"\t");
                    val++;
                }
                else{
                    System.out.print(val + "\t");
                    val--;
                }
                j++;
            }
            if(row<n){
                star += 2;
                space--;
                val++;
            }
            else{
                star -= 2;
                space++;
                val--;
            }
            val++;
            row++;
            System.out.println();
        }
    }
}
