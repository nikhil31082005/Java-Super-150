package Pattern;

public class pascal_triangle {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        while(row<n){
            int val = 1;
            int col = 0;
            while(col<=row){
                System.out.print(val + "\t");
                val = val * (row - col)/(col + 1);
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
