package leetcode_practise;

public class p_35 {

    public static int solution(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return m;
            } else if (target > nums[m]) {
                s = m + 1;
            } else if (target < nums[m]) {
                e = m - 1;
            }
        }

        return s - 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(solution(nums, target));
    }
}
