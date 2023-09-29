package Pattern;

public class hollow_rhombus_pattern {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = n;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                if(row==1 || row==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            space--;
            row++;
            System.out.println();
        }
    }
}
