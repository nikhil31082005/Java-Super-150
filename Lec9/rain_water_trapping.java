package Lec9;

public class rain_water_trapping {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

//        for (int i = 0; i < n; i++) {
//            System.out.print(left[i] + " ");
//        }
//        System.out.println();
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(right[i] + " ");
//        }
//        System.out.println();
        int count = 0;
        for(int i=0;i<n;i++){
            count += Math.min(left[i],right[i]) - arr[i];
        }
        return count;
    }
}
