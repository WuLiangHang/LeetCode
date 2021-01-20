package hashtable;

import org.junit.Test;

import java.util.HashSet;

public class LeetCode202 {
    public int getSum(int n) {
        //获取各位数字的平方和
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (true) {
            int sum = getSum(n);
            if (sum == 1) {
                return true;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
    }

    @Test
    public void test() {
//        System.out.println(getSum(100));
        System.out.println(19 % 10);
        System.out.println((222 >>1));

    }
}
