package Lec8;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,7,3};
        sort(arr);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            swap(arr,i,Min_Value_Index(arr,i));     //
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Min_Value_Index(int[] arr,int i){
        int mini = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini = j;
            }
        }
        return mini;
    }
}
