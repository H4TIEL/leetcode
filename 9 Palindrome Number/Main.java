package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Test cases
        // 123  321 false
        // 121 121 true
        // -21 12- false
        // 10  01 false
        // 0 0 true
        System.out.println(isPalindrome(121));
        System.out.println(isPalindromeSolution(121));
    }

    public static boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        else if (x < 0 || x % 10 == 0)
            return false;


        int length = (int) (Math.log10(x) + 1);
        int[] splitArray = new int[length];
        int[] reverseArray = new int[length];
        //Get digits
        for (int position = 0; position < length; position++) {
            reverseArray[position] = (int) ((x / Math.pow(10, position)) % 10);
        }
        // Get split reverse of reverseArray
        for (int index = 0; index < length; index++) {
            splitArray[index] = reverseArray[reverseArray.length - index - 1];
        }

        return Arrays.equals(splitArray, reverseArray);
    }

    public static boolean isPalindromeSolution(int x) {
        // Special cases
        // zero is true
        // negative numbers are not palindromes
        // multiples of ten are not palindromes 10 -- > 01 but is 1
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;

        // Algorithm
        // Reverse half split number
        int reversed = 0;
        while(x > reversed) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        // Handle odd numbers
        return x == reversed || x == reversed / 10;
    }
}