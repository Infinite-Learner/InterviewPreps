package Binary_Search;

public class Koko_Eating_Banana {
    public static int minEatingSpeed(int[] piles, int h) {
        //  if(piles.length > h) return 0;
        // int left = 1;
        // int right= -1;
        // for(int pile : piles) {
        //     right = Math.max(right, pile);      
        // }
        // int optimal_speed = 0;
        // while(left <= right) {
        //     int mid = left + (right - left) / 2;
        //     int eatingTime = 0;
        //     for(int i=0; i < piles.length; i++) {
        //         eatingTime += Math.ceil((double)piles[i] / mid);
        //     }
        //     if(eatingTime > h) {
        //         left = mid + 1;
        //     }
        //     else {
        //         optimal_speed = mid;
        //         right = mid - 1;
        //     }
        // }
        // return optimal_speed; // 27ms
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
        
        return left; //0ms
    }
    public static void main(String[] args) {
        int[][]test_cases = {{3,6,7,11},{30,11,23,4,20},{8,10,12}};
        int[]test_h = {8,5,10};
        for(int i = 0; i < test_cases.length; i++) {
            System.out.println(minEatingSpeed(test_cases[i],test_h[i]));
        }
    }
}
