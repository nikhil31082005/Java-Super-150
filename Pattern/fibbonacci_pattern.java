package Pattern;

public class fibbonacci_pattern {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        int c = a + b;
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print(a+"\t");
                i++;
                a = b;
                b = c;
                c = a+b;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
