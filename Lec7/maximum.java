package Lec7;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {2,3,15,7,11,8,9,6};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int max1(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
