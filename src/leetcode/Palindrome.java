package leetcode;

public class Palindrome {
    public static int minPartitions(String n) {
        int num = Integer.parseInt(n);
        int count = 0, sum=0;
        for(int i=10; i<=num; i++) {
            if(isDeciBinary(i) && num != sum) {
                sum += i;
                ++count;
            }
        }
        return sum;
    }

    public static boolean isDeciBinary(int num) {
        int temp = num;
        while(temp>0) {
            temp = num%10;
            if(temp > 1) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
    }
}
