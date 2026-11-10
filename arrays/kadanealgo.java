package arrays;
import java.util.*;
public class kadanealgo{
    public static void kadane(int marks[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            currsum+=marks[i];

            maxsum=Math.max(maxsum, currsum);
            if(currsum<0){
              currsum=0;
            }
        
            
        }
        System.out.println("max subarray sum is:" + maxsum);

    }
    public static void main(String args[]){
        int marks[]={-2,-3,-4,-1,-2,-1,-5,-3};
      kadane(marks);
}};