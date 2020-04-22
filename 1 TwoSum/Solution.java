package com.h4tiel.main;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /** BruteForce
    * Time complexity : O(n^2) O(n^2). For each element, we try to find its complement by looping through the rest of array which takes O(n)O(n) time.
    * Therefore, the time complexity is O(n^2)O(n^2).
    * Space complexity : O(1)O(1). */
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        boolean isFound =  false;
        for(int i = 0; i < nums.length; i++) {
            if(!isFound){
                int search = target - nums[i];
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j] == search){
                        twoSum[0] = i;
                        twoSum[1] = j;
                        isFound = true;
                        break;
                    }
                }
            }
        }
        return twoSum;
    }

    /** One-Pass Hash Table
     * Time complexity : O(n)O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1) O(1) time.
     * Space complexity : O(n)O(n)*/
    public int[] bettertwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}