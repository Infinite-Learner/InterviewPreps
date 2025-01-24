package Binary_Search;

public class Successful_Pairs_of_Spells_and_Potions {

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        int max = 0;
        for (int i = 0; i < potions.length; i++) {
            if (max < potions[i]) {
                max = potions[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < potions.length; i++) {
            count[potions[i]]++;
        }
        int sum = 0;
        for (int i = max; i >= 0; i--) {
            sum += count[i];
            count[i] = sum;
        }

        for (int i = 0; i < spells.length; ++i) {
            int spell = spells[i];
            long th = (success + spell - 1) / spell;
            if (th <= max) {
                result[i] = count[(int) th];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        for(int i : successfulPairs(new int[]{5,1,3},new int[]{1,2,3,4,5},7)){
            System.out.println(i);
        }
    }
}