package Pattern;

public class zero_pattern {
    public static void main(String[] args) {
        int n = 10;
        int row = 1;
        int star = 1;
        int val = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                if(i==1||i==row){
                    System.out.print(val+"\t");
                }
                else{
                    System.out.print("0\t");
                }
                i++;
            }
            val++;
            star++;
            row++;
            System.out.println();
        }
    }
}
