package Round2_16_1_25;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class testRunner {
    public static void main(String[] args) {
        int[][] E1Testcases = new int[][]{
                {10,20,0,56,0,7,0,9,0,0},
                {98,99,0,0,0,78,99},
                {1,2,0,4,3,0,5,0,0},{20,25,18}
        };
        String[][] E2Testcases = {
                {"abc","abbca"},
                {"ab","baa"},
                {"ac","bc"},
                {"a","b"}
        };

        String[] E3Testcases = {"ZohuUkKO","COOOOodDinGgg","" };
        String[] M1Testcases = {"abcabcdaa","bbbb","acabab"};
        int[][] M2Testcases = {
                {1,3,2},
                {2,7,9,3,1},
                {10,11,21,45,17,65,77,4},
                {78,12,88,56,89,1}
        };
        int[][] M3Testcases = {
                {3, 0, 1, 0, 4, 0, 2},
                {3, 0, 2, 0, 4},
                {1, 2, 3, 4},
                {2, 1, 5, 3, 1, 0, 4}

        };
        int[][][] H1Testcases = {
                {{1,2,5},{11}},
                {{2},{3}},
                {{1},{0}}
        };
        System.out.println("E1 : Move zeros to end");
        for (int[] arr : E1Testcases)
            System.out.printf("\tInput : arr[] = %s \n\tOutput: %s \n", Arrays.toString(arr), Arrays.toString(E1.moveZeroes(arr)));
        System.out.println("E2 : String Construction");
        for (String[] arr : E2Testcases)
            System.out.printf("\tInput : \"%s\", \"%s\"\n\tOutput: %b\n", arr[0], arr[1], E2.isConstructable(arr[0], arr[1]));
        System.out.println("E3 : Remove pairs of different case");
        for (String str : E3Testcases)
            System.out.printf("\tInput : \"%s\"\n\tOutput : \"%s\"\n", str, E3.remove_Pairs_of_AltCase(str));
        System.out.println("M1 : Longest substring without repeating characters");
        for (String str : M1Testcases)
            System.out.printf("\t\"%s\"\n\tOutput:%d\n", str, M1.longest_Substring_without_Repetition(str));
        System.out.println("M2 : House Robber - Max Amount");
        for (int[] arr : M2Testcases)
            System.out.printf("\tInput : arr[] = %s \n\tOutput: %s \n", Arrays.toString(arr), M2.MaxPossibleRobberyAmount(arr));
        System.out.println("M3 : Trapping rain water");
        for (int[] arr : M3Testcases)
            System.out.printf("\tInput : arr[] = %s \n\tOutput: %s \n", Arrays.toString(arr), M3.maxWater(arr));
        System.out.println("H1 : Coin change");
        for (int[][] arr : H1Testcases)
            System.out.printf("\tInput : coins = %s , amount =  %d \n\tOutput: %d \n", Arrays.toString(arr[0]), arr[1][0], H1.coinChange(arr[0], arr[1][0]));
    }
}
