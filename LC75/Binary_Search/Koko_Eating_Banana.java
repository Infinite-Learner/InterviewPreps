package Binary_Search;

public class Koko_Eating_Banana {
    public static int minEatingSpeed(int[] piles, int h) {
        // 
        int n = piles.length;
        long total = 0;
        for (int p : piles) total += p;

        int left = (int) ((total - 1) / h) + 1;
        int right = (int) ((total - n) / (h - n + 1)) + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;
            for (int p : piles) {
                time += (p - 1) / mid + 1;
            }
            if (time > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    public static void main(String[] args) {
        int[][]test_cases = {{3,6,7,11},{30,11,23,4,20},{8,10,12}};
        int[]test_h = {8,5,10};
        for(int i = 0; i < test_cases.length; i++) {
            System.out.println(minEatingSpeed(test_cases[i],test_h[i]));
        }
    }
}
