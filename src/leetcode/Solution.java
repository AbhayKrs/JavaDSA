package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();


        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length && i!=j; j++) {
                for (int k = j + 1; k < nums.length && j != k && i != k; k++) {
                    List<Integer> triplet = new ArrayList<Integer>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        System.out.println("Check " + triplet);
                        if (!output.contains(triplet)) {
                            output.add(triplet);
                        }
                    }
                }
            }
        }
        return output;
    }
}
