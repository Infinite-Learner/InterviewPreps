
/*
String Construction :
    There is two strings are given as an input str1 and str2.
    you should return true if str1 can be formed using str2.
    Each character as count as unique.
    Example 1 :
        Input : str1 = "ab" , str2 = "aa"
        Output : False
        Explanation : character 'b' is not in str2
    Example 2 :
        Input : str1 = "aab" , str2 = "ab"
        Output : False
        Explanation : character 'a' is not enough in str2
    Example 3 :
        Input : str1 = "abc" , str2 = "aabc"
        Output : True
        Explanation : Each Character in str1 is present in str2.
 */
package Round2_16_1_25;

import java.util.HashMap;
import java.util.Map;
public class E2 {
    public static boolean isConstructable(String str1, String str2) {
        Map<Character, Integer> str2map = new HashMap<>();
        for (char c : str2.toCharArray()) {
            str2map.computeIfAbsent(c, k -> 1);
            str2map.computeIfPresent(c, (k, v) -> v + 1);
        }
        for (char c : str1.toCharArray()) {
            if (str2map.get(c) == null || str2map.get(c) == 0)
                return false;
            str2map.computeIfPresent(c, (k, v) -> v - 1);
        }
        return true;
    }
}