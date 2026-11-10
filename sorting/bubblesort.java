package sorting;

import java.util.Arrays;

//large elementscome to th end of array by swapping adjacent elements if they are in wrong order
// 5,4, 1, 3, 2; 4,1,3,2,5;1,3,2,4,5;1,2,3,4,5;n=5,turns=n-2;time complexity=O(n^2);space complexity=O(1);
// 4, 5, 1, 3, 2;1,4,3,2,5;1,3,2,4,5;1,2,3,4,5;
// 4, 1, 5, 3, 2;1,3,4,2,5;1,2,3,4,5;
// 4, 1, 3, 5, 2;1,3,2,4,5;
public class bubblesort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                arr[j+1]=temp;    
                }
            }

        }
    }
    
   
    public static void main(String args[]){
        int arr[]={2,4,5,-1,1,6};
        bubble(arr);
System.out.println("the sorted array is:" + Arrays.toString(arr));
    }

    
}
