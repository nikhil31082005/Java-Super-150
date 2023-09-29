package Lec7;

public class reverse_range {
    public static void main(String[] args) {
        int[] arr = {2,3,15,7,11,8,9,6,22,45,1,6,57,28,61};
        int start = 3;
        int end = 10;
        reverse_range(arr,start,end);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
