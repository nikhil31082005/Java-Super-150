package Pattern;

public class pattern16 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n/2-i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("  ");
            }
            for(int p=0;p<n/2-i;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n/2;i<n;i++){
            for(int j=n/2;j>=i;j--){
                System.out.print("* ");
            }
            for(int k=2*i-1;k>0;k--){
                System.out.print("  ");
            }
            for(int p=n/2;p>=i;p--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
