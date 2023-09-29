package Lec2;

public class pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
//        while(row<=n){
//            int i = 1;
//            while(i<=star){
//                System.out.print("* ");
//                i++;
//            }
//            row++;
//            star++;
//            System.out.println();
//        }
//        star -= 2;
//        while(row<=2*n-1){
//            int i = 1;
//            while(i<=star){
//                System.out.print("* ");
//                i++;
//            }
//            row++;
//            star--;
//            System.out.println();
//        }




        while(row<=2*n-1){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            if(row<n){
                star++;
            }
            else{
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
