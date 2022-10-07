package leetcode;

public class ElementInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,8,9, 10};
        int target = 8;
        int start = 0, end = 2;
        int pos = fintInInfinite(arr, target,start, end);
        System.out.println(pos);
    }

    static int fintInInfinite(int[] arr, int target, int start, int end) {
        while(start<=end) {
            int mid= start + (end-start)/2;
            if(target<arr[mid]) {
                end = mid-1;
            } else if(target>arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
       int ans =  fintInInfinite(arr, target, end, end^2);
        return ans;
    }
}
