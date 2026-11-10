package arrays;
import java.util.*;
// Prefix Sum solution to find the maximum subarray sum
// Time Complexity: O(n^2)
// Space Complexity: O(n)
// The prefix sum array allows us to calculate the sum of any subarray in constant time, which reduces the overall time complexity compared to the brute force approach. However, it still has a nested loop structure, resulting in O(n^2) time complexity. The space complexity is O(n) due to the additional prefix sum array used to store cumulative sums.

public class prefixsumforsubarray {

    public static void print(int marks[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]=new int[marks.length];
        prefix[0]=marks[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+marks[i];

        };


        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                currsum = 0;

                currsum= start==0 ? prefix[end] :prefix[end]-prefix[start-1];

                

                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("The maximum subarray sum is: " + maxsum);
    }

    public static void main(String args[]) {
        int marks[] = {2, 3, 4, 5, 6, -7357, -998, 9, 0, 10};
        print(marks);
    }
}
