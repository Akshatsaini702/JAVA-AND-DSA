package sorting;
import java.util.Arrays;

public class countingsort {
    public static void countsort(int arr[]){
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
     }
     int countarr[]= new int[max+1];
      for(int i=0;i<arr.length;i++){
        countarr[arr[i]]++;
      }

      int j=0;
     for(int i=0;i<countarr.length;i++){
        while(countarr[i]>0){
            arr[j]=i;
            j++;
            countarr[i]--;
        }
     }
    }
    
    public static void main(String args[]){
        int arr[]={5,2,8,1,9};
     countsort(arr);
           System.err.println(Arrays.toString(arr));
    }
    
}
