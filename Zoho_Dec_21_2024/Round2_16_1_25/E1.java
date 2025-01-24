/*
Moving Zeros to end of Array
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
    Input : nums = [1,2,0,4,3,0,5,0,0]
    Output : nums = [1,2,4,3,5,0,0,0]
Example 2:
    Input : nums = [10,20,30]
    Output : nums = [10,20,30]

Constraints:
    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1
*/
package Round2_16_1_25;
public class E1 {
    public static int[] moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }
}
