/*
Remove Pairs with Different Case:
Take a string as an input.If the String contains same letter continuously with alternate case then remove them and return remaining string.
If string is empty then return -1.
Example 1:
    Input : "ZohuUkKO"
    Output : ZohO
Example 2:
    Input :  "COOOOodDinGgg"
    Output : COOOing
Example 3:
    Input : ""
    Output : -1
 */
package Round2_16_1_25;
public class E3 {
    public static String remove_Pairs_of_AltCase(String str){
        StringBuilder sb = new StringBuilder(str);
        if(str.isEmpty()) return "-1";
        int i = 0;
        while (i < sb.length() - 1) {
            if (Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(i + 1)) && sb.charAt(i) != sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
