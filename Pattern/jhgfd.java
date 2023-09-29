package Pattern;

public class jhgfd {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(primeSubOperation(nums));

    }
    public static boolean primeSubOperation(int[] nums) {
        if(isSorted(nums)) return true;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] - findPreviousPrime(nums[i]);
            if(isSorted(nums)) return true;
        }
        return false;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findPreviousPrime(int num) {
        for (int i = num - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return num;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
