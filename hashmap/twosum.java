package hashmap;
import java.util.*;
public class twosum {
    public static int[] twosums(int arr[],int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};

    }
    public static void main(String args[]){
        int arr[]={3,5,7,8,9,4};
       int result[]= twosums(arr,15);
       System.out.println(Arrays.toString(result));
    }
    
}
