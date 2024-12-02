package HashSet_HashMap;

// import java.util.Map;
// import java.util.Set;
// import java.util.HashMap;
// import java.util.HashSet;
public class Unique_Number_Of_Occurences{
    public static boolean uniqueOccurrences(int[] arr) {
        // Map<Integer,Integer>freq = new HashMap<>();
        // for(final int i : arr){
        //     freq.put(i,freq.getOrDefault(i,0)+1);
        // }
        // Set<Integer>set = new HashSet<>();
        // for(final int i : freq.values()){
        //     if(!set.add(i));
        // }
        // return freq.size()==set.size();
        var freq = new int[2001];
        for (var n : arr) freq[n + 1000]++;

        var count = new boolean[1001];
        
        for (var n: arr) {
            var c = freq[n + 1000];
            freq[n + 1000] = 0;
            if (c > 0 && count[c])
                return false;
            count[c] = true;
        }

        return true;
    }
    public static void main(String[] args) {
        int[][]test_cases = {
            {1,2,2,1,1,3},
            {1,2,2,1,1,3,4,4,4,4},
            {-3,0,1,-3,1,1,1,-3,10,0},
            {1,2}
        };
        for(final int[]i : test_cases){
            System.out.println(uniqueOccurrences(i));
        }
    }
}
