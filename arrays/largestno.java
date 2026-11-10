package arrays;
import java.util.*;

public class largestno {
    public static int getlargest(int marks[]){
        int large=Integer.MIN_VALUE;// -INFINITY
        for(int i=0;i<marks.length;i++){
            if(large<marks[i]){
                large=marks[i];

            };
        };
        return large;
    }
    public static void main( String args[]){
            int marks[]={1,2,43,6,54,676,789};
            System.out.println("the largest number in the array is:" + getlargest(marks));

    };
    
};
