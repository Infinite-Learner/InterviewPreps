package StackBased;

import java.util.Stack;

public class RemoveStarsFromString {
    // https://leetcode.com/problems/remove-stars-from-string/
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            } 
            else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String[] teStrings = {
        "leet**code**",
        "er*ase**",
        "lEET*Code**",
        "era**sed",
        "erased*"};
        for(final String s : teStrings){
            System.out.println(removeStars(s));    
        }
    }

}
