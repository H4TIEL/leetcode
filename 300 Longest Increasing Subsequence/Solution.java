package com.h4tiel.main;

import java.util.Arrays;

public class Solution{

    public static void main(String[] args) {
        // Van der Corput Sequence
        int[] array = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int length = LongestIncreasingSubsequence(array);
        System.out.println(length);
    }

    public static int LongestIncreasingSubsequence(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

    /*
      Array to store our subproblems, default answer is 1. A single
      item is neither increasing or decreasing, kind of a middle ground.
      Each index records the answer to "what is the longest increasing
      subsequence ending at index i of the original array?"
    */
        int[] maxLength = new int[nums.length];
        Arrays.fill(maxLength, 1);
        
        int maximumSoFar = 1;

    /*
      Test every possible end index of a longest increasing subsequence
    */
        for (int i = 1; i < nums.length; i++) {
      /*
        We aim to see if we can append the item at nums[i]
        to extend the Longest Increasing Subsequence achieved
        from index 0...j (which is what the cache records)
        We want to solve for maxLength[i] if the value at 'i'
        beats 'j'. If we can we see which is greater between
        these then we have our answer:
        1.) maxLength[i]: The best answer so far for the LIS from 0...i
        2.) maxLength[j] + 1: The value of maxLength[j] is the length
        of the LIS from 0...j, we conceptually "append" this item to
        that LIS by adding 1 to that subproblem answer, yielding a
        potentially new answer for LIS[0..i]
      */
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
                }
            }

      /*
        We now have an answer for LIS[0...i]. Compete it against the
        best LIS length found so far.
      */
            maximumSoFar = Math.max(maximumSoFar, maxLength[i]);
        }

        return maximumSoFar;
    }


}

/*
Solutions
Length: 6
0, 2, 6, 9, 11, 15.
0, 4, 6, 9, 11, 15
0, 2, 6, 9, 13, 15
0, 4, 6, 9, 13, 15
 */