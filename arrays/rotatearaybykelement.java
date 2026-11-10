package arrays;

import java.util.Arrays;

public class rotatearaybykelement {
    public static void reverse(int arr[],int start,int end ){
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        };

       
    };
     public static void rotate(int arr[],int k){
        int n=arr.length;
        if(n==1) return;

        k=k%n;
        if(k==0) return;
    

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
         
                
            
        };
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=4;
        System.out.println("Original array is:" + Arrays.toString(arr));
        rotate(arr,k);
        System.out.println("Rotated array is:" + Arrays.toString(arr));

    }
    
}
