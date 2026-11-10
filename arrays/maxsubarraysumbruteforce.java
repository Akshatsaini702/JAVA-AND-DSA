package arrays;
import java.util.*;
// Brute Force solution to find the maximum subarray sum
// Time Complexity: O(n^2)

public class maxsubarraysumbruteforce {
    // Optimized solution using Kadane's Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void print(int marks[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < marks.length; i++) {
            currsum += marks[i];
            
            if (currsum > maxsum) {
                maxsum = currsum;
            }
            
            // Reset current sum if it becomes negative
            if (currsum < 0) {
                currsum = 0;
            }
        }

        System.out.println("The maximum subarray sum is: " + maxsum);
    }

    public static void main(String args[]) {
        int marks[] = {4,5,6,8,4,5,6,7,7,743,3,3};
        print(marks);
    }
}
