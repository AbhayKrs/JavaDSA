package leetcode;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int i=0, largest = 0;
        while(i<s.length()) {
            int count = 1;
            char x = s.charAt(i);
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(j) == x || s.substring(i, j).indexOf(s.charAt(j)) > -1) {
                    break;
                }
                count++;
            }
            if(count > largest) {
                largest = count;
            }
            i++;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
