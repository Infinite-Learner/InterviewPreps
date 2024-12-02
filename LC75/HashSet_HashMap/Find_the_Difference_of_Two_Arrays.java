package HashSet_HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Find_the_Difference_of_Two_Arrays 
{
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i: set1){
            if(!set2.contains(i)){
                list1.add(i);
            }
        }
        for(int i: set2){
            if(!set1.contains(i)){
                list2.add(i);
        }
        
    }
    res.add(list1);
    res.add(list2);  
    return res;
}
    public static void main(String[] args) {
        int[][] test_cases = {{1,2,3},{2,4,6},{1,2,3,3},{1,1,2,2,2,3},{1,2,3,3,4,5,6,7,7},{1,2,3,4,5,6,7,8,9}};
        for(int i=0;i<=test_cases.length/2+1;i+=2){
            System.out.println(findDifference(test_cases[i],test_cases[i+1]));
        }
    }
}
