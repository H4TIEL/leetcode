package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("MMMCMXCIX"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        int sum = 0;
        for (int index = 0; index < s.length(); index++) {
            int current = dictionary.get(s.charAt(index));
            if (index + 1 == s.length()) {
                sum += current;
                break;
            }
            int next = dictionary.get(s.charAt(index + 1));
            if (next > current) {
                // Next value is greater than current
                sum += next - current;
                index++;
                continue;
            }
            sum += current;
        }

        return sum;
    }

}
