/*
Longest Substring without Repeating Characters :
    A string is given as an input.you should return a substring that has unique chars without repetition.

    Example 1 :
        Input : "abcabcdaa"
        Output : "abcd"
    Example 2 :
        Input : "bbbb"
        Output : "b"
    Example 3 :
        Input : "acabab"
        Output : "cab"
 */
package Round2_16_1_25;

import java.util.HashMap;
import java.util.Map;
public class M1 {
    public static int longest_Substring_without_Repetition(String str) {
        int i=0;
        int j=0;
        int result=0;
        Map<Character,Integer> hmap = new HashMap<>();
        while(j<str.length())
        {
            char ch = str.charAt(j);
            if(hmap.containsKey(ch)){
                i = Math.max(hmap.get(ch),i);
            }
            result = Math.max(result,j-i+1);
            hmap.put(ch,j+1);
            j++;
        }
        return result;
    }
}
