package arrays;
import java.util.Arrays;

public class removeduplicates {
    public static int removedup(int arr[]){
        if(arr.length==0) {return 0;};

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
             arr[i]=arr[j];

            }
           
        }
      return i+1;
    }
    public static void main(String args[]){
        int arr[]={3,4,5,5,5,6,6,6,6,6,8,8,8,9,9};
        int k= removedup(arr);
        for(int i=0;i<k;i++){
        System.out.print( arr[i] )

       ;
    }
    
}}
