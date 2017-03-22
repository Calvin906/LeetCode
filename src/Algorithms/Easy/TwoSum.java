package Algorithms.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wags on 3/21/17.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int tar = 9;
        System.out.print(twoSum(nums, tar));
        System.out.print(twoSum1(nums, tar));
    }

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p/>
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p/>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * <p/>
     * RUNTIME: O(N^2)  BRUTE FORCE
     * This algo compares every element in the list against another.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;

    }

    /**
     * Better Algo
     * <p/>
     * RUNTIME: O(N) HASHMAP
     * This algo only passes once, and checks against previous elements in map.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (m.containsKey(diff)) {
                return new int[]{m.get(diff), i};
            }
            m.put(nums[i], i);
        }
        return nums;
    }
}