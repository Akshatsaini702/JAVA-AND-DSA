package hashmap;
import java.util.*;

public class subarraysumequalsk {

    public static int subarr(int arr[],int k){
        if(arr.length==0) return -1;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,prefixsum=0;
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];

            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }

            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);

            
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={1,1,1,1,1,1,1,1,1,21,1};
        System.out.println(subarr(arr,4));
    }

    
}
