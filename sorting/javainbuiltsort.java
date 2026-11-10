package sorting;
import java.util.Arrays;
//java inbuilt sort uses quicksort for primitive data types and mergesort for objects

public class javainbuiltsort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,7,3,6,8,9};
        //for java inbuilt sort
        // Arrays.sort(arr,startindex,endindex+1)
        Arrays.sort(arr,0,4);
        printarr(arr);

    }
    
};
