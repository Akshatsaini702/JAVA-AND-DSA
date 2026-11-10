package sorting;
import java.util.Arrays;
//selection sort is based on the idea of finding the minimum element from unsorted array and putting it at the beginning of array

public class selectionsort {
    public static void select(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
      }
//swap
int temp=arr[min];
arr[min]=arr[i];
arr[i]=temp;
        }
    }
    
    public static void main(String args[]){
        int arr[]={4,5,7,3,6,8,9}
; select(arr);
System.out.println(Arrays.toString(arr));

    }
    
}
