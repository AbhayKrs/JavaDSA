package leetcode;

public class NumberCeiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = ceiling(arr, target);
        System.out.println("Ceiling is " + ans);
    }

    static int ceiling(int[] arr, int target) {

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int low=0, high=arr.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(target < arr[mid]) {
                high = mid-1;
            } else if (target > arr[mid]) {
                low = mid+1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
