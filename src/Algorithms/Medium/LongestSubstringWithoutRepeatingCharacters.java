package Algorithms.Medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Wags on 3/21/17.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * <p/>
     * Examples:
     * <p/>
     * Given "abcabcbb", the answer is "abc", which the length is 3.
     * <p/>
     * Given "bbbbb", the answer is "b", with the length of 1.
     * <p/>
     * Given "pwwkew", the answer is "wke", with the length of 3.
     * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     *
     * RUNTIME: O(N)
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

}
