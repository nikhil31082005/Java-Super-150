package Lec10;

//    https://leetcode.com/problems/maximum-subarray/

public class maximum_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }

//
}
