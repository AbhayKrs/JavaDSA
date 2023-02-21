package leetcode_practise;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        int n = 5;
        int s = 12;
        int[] arr = { 1, 2, 3, 7, 5 };
        int i = 0, j = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (j < n) {
            if (sum != s)
                sum += arr[j];

            if (sum < s)
                j++;
            else if (sum == s) {
                System.out.println(i + " " + j);
                ans.add(i + 1);
                ans.add(j + 1);
                j++;
            } else if (sum > s) {
                while (sum > s) {
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
    }
}
