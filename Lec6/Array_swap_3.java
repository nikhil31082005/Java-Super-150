package Lec6;

public class Array_swap_3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};
        System.out.println(arr1[0] + " " + arr2[0]);
        swap(arr1,arr2);
        System.out.println(arr1[0] + " " + arr2[0]);
    }

    public static void swap(int[] arr1,int[] arr2){
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }
}
