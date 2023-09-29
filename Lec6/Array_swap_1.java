package Lec6;

public class Array_swap_1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
