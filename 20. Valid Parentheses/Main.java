package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Boolean> tests = new HashMap<>();
        tests.put("({[]})", true);
        tests.put("()[]", true);
        tests.put("(){}}{", false);
        tests.put("]", false);

        tests.forEach((k, v) -> {
            System.out.print(isValid(k));
            System.out.print(" : ");
            System.out.println(v);
        });
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> characters = new Stack<>();
        for (Character c : s.toCharArray()) {
            // Closing parenthesis
            if (map.containsKey(c)) {
                char top = characters.empty() ? characters.push('*') : characters.pop();
                if (top != map.get(c))
                    return false;
            } else {
                // Opening parenthesis
                characters.push(c);
            }
        }

        return characters.isEmpty();
    }
}