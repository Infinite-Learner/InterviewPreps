package Binary_Search;

public class Find_Peak_Element {
    private static int findPeek(int[] nums) 
    {
        int left = 0 , right=nums.length-1;
        while(left<right){
            int mid = (left+right)>>1;
            if(nums[mid]>nums[mid+1])
            {
                right=mid;
            }
            else {
                left=mid+1;}
        }
        return left; 
    }
    public static void main(String[] args) {
        int[][] test_cases = {
            {1,2,3,4,6,2},
            {3,78,2,1},
            {1,4,6,9,11,99,6}
            };    
        for(final int[] test : test_cases)
            System.out.println(findPeek(test));
    }
    
}
