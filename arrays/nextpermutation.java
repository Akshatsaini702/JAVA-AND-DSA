package arrays;
import java.util.Arrays;

public class nextpermutation {
    public static void nextpermut(int arr[]){
        if(arr == null || arr.length <= 1) return;
        int i=arr.length-2;
        
        //till breaking point traversal condition

        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        };
            // finding breaking point condition
        if(i>=0){
            int j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
             swap(arr,i,j);
        
        };

       reverse(arr,i+1,arr.length-1);

            
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    };

    public static void reverse(int arr[] , int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }}
    public static void main(String args[]){
        int arr[]={};
        System.out.println("the array before permutation is :"+ Arrays.toString(arr));
        nextpermut(arr);
        System.out.println("the array before permutation is :"+ Arrays.toString(arr));

    }

    
}
