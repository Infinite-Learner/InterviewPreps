package HashSet_HashMap;

import java.util.ArrayList;
import java.util.List;


public class Find_the_Difference_of_Two_Arrays_opt
{
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
     
        return new java.util.AbstractList<List<Integer>>() {
            List<Integer> distinct1 = null;
            List<Integer> distinct2 = null;

            @Override public int size() {
                return 2;
            }

            @Override public List<Integer> get(int i) {
                if (distinct1 == null) process();
                return i == 0 ? distinct1 : distinct2;
            }

            public void process() {
                distinct1 = new ArrayList<>();
                distinct2 = new ArrayList<>();

                byte[] seen1 = new byte[2001];
                for (int i = 0; i < nums1.length; i++) {
                    seen1[nums1[i]+1000] = 0b1;
                }

                byte[] seen2 = new byte[2001];
                for (int i = 0; i < nums2.length; i++) {
                    int num = nums2[i]+1000;
                    seen2[num] = 0b1;
                    if (seen1[num] == 0b0) {
                        distinct2.add(nums2[i]);
                        seen1[num] = 0b1;
                    }
                }

                for (int i = 0; i < nums1.length; i++) {
                    int num = nums1[i]+1000;
                    if (seen2[num] == 0b0) {
                        distinct1.add(nums1[i]);
                        seen2[num] = 0b1;
                    }
                }
            }
        };
}
    public static void main(String[] args) {
        int[][] test_cases = {{1,2,3},{2,4,6},{1,2,3,3},{1,1,2,2,2,3},{1,2,3,3,4,5,6,7,7},{1,2,3,4,5,6,7,8,9}};
        for(int i=0;i<=test_cases.length/2+1;i+=2){ 
            // optimized
            System.out.println(findDifference(test_cases[i],test_cases[i+1]));
        }
    }
}
