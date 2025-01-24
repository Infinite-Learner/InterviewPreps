/*
Trapping Rainwater Problem states that given an array of n non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it can trap after rain.
    Example 1:
        Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
        Output: 10
        Explanation: The expected rainwater to be trapped is shown in the above image.
    Example 2:
        Input: arr[] = [3, 0, 2, 0, 4]
        Output: 7
        Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.
    Example 3:
        Input: arr[] = [1, 2, 3, 4]
        Output: 0
        Explanation: We cannot trap water as there is no height bound on both sides
    Example 4:
        Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
        Output: 9
        Explanation : We trap 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units of water.

 */
package Round2_16_1_25;

public class M3 {
       public static int maxWater(int[] arr) {
            int left = 1;
            int right = arr.length - 2;
            int lMax = arr[left - 1];
            int rMax = arr[right + 1];
            int res = 0;
            while (left <= right) {
                if (rMax <= lMax) {
                    res += Math.max(0, rMax - arr[right]);
                    rMax = Math.max(rMax, arr[right]);
                    right -= 1;
                } else {
                    res += Math.max(0, lMax - arr[left]);
                    lMax = Math.max(lMax, arr[left]);
                    left += 1;
                }
            }
            return res;
        }
    }
