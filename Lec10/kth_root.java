package Lec10;

public class kth_root {
    public static void main(String[] args) {
        int k = 3;
        int n = 146;
        System.out.println(max2(k,n));
    }
    public static int max(int k ,int n){
        int x = 0;
        while((int)(Math.pow(x,k))<n){
            x++;
        }
        return x-1;
    }
    public static int max2(int k, int n){
        int start = 0;
        int end = n;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((int)(Math.pow(mid,k)) <= n){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int max3(int k,int n){
        return (int)(Math.log10(n))/(int)(Math.log10(k));
    }
}
