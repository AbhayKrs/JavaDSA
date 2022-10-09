package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumAddicts {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        int[] arr2 = arr;
        arr2[1] = 75;
        int[] arr3 = arr.clone();
        arr3[2] = 45;
        System.out.println(Arrays.toString(arr));
    }
}
