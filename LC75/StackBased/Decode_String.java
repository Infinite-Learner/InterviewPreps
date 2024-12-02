package StackBased;

import java.util.ArrayDeque;
import java.util.Deque;

class Decode_String {
    public static String decodeString(String s) {
      Deque<String> stringStack = new ArrayDeque<>();
        Deque<Integer> countStack = new ArrayDeque<>();
    // StringBuilder to build the current string being processed
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the repeat count (handles multi-digit numbers)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current string and repeat count to their respective stacks
                stringStack.push(currentString.toString());
                countStack.push(k);
                // Reset currentString and k for the new segment
                currentString = new StringBuilder();
                k = 0;

            } else if (ch == ']') {
                // Pop the last saved string and repeat count
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                // Append the repeated current string to the previous string
                decodedString.append(currentString.toString().repeat(repeatCount));
                // Update currentString
                currentString = decodedString;
            } else {
                 // Append regular characters to the current string
                currentString.append(ch);
            }

        }
                // The final result is stored in currentString
        return currentString.toString();  
    }
    public static void main(String[] args) {
        String[]teStrings = {"3[a]2[bc]", "3[a2[c]]", "2[abc]3[cd]ef", "100[leetcode]","10[C]5[O]6[X]"};
        for(final String s : teStrings)
            System.out.println(decodeString(s));
    }
}