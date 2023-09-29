package Lec7;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {2,3,15,7,11,8,9,6};
        int ele = 9;
        System.out.println(search(arr,ele));
    }
    public static int search(int[] arr,int ele){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}
