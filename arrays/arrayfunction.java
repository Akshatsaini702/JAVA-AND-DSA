package arrays;
import java.util.*;
public class arrayfunction {
    public static void arr(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=5;
        };

    };
    public static void main(String args[]){
        int marks[]={1,2,3,4,5,5,6,6,8};
        arr(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        };
        System.out.println();
    };
    
};
