package practice;
import java.util.*;

public class practice{
   
    public static void merge (int arr[],int start,int end){
        if(start>=end){
            return;
        }
        
       int p= mergesort(arr,start,end);
        merge(arr,start,p-1);
        merge(arr,p+1,end);
        };
         public static void mergesort(int arr[],int start,int end){
            int i=start-1;
            int pivot=arr[end];
            for(int j=start;j<end;j++){
                if(arr[j]<pivot){
                    i++;
                     int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                }
               
            }
            i++;
            int temp=pivot;
            pivot=arr[i];
            arr[i]=temp;
            return i;

        }

        
    public static void main (String args[]){
        int arr[]={5,6,2,5,7,8,3,21,9};
        merge(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }}
    
    

        
    
     
    
   
    
   

