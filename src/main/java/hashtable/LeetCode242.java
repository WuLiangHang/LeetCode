package hashtable;

import org.junit.Test;

public class LeetCode242 {
    //哈希表解法
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[(s.charAt(i) - 97)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[(t.charAt(i) - 97)]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
