package Lec10;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,11,15,19,21,26,27,31};
        int target = 15;
        System.out.println(search(arr,target));
    }

    public static int search(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
