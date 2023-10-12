package Lec11;
//  https://leetcode.com/problems/next-permutation/
public class next_Permutation {
    public static void main(String[] args) {
        int[] arr = {4,2,8,6,5,4,7,3};
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void nextPermutation(int[] arr){
        int p = -1;
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]<arr[i+1]){
                p = i;
                break;
            }
        }
        if(p==-1){
            reverse_range(arr,0,arr.length-1);
            return;
        }
        int q = -1;
        for(int i = arr.length-1;i > p;i--){
            if(arr[i] > arr[p]){
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        reverse_range(arr,p+1,arr.length-1);
    }
    public static void reverse_range(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
