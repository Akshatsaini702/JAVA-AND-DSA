package recursion;

public class firstoccurenceofelementinarray {
     public static int firstocc(int arr[],int i ,int key){
        if(i== arr.length){
            return -1;
        }
        if (arr[i]==key) {
            return i;
            
        }
        
        return firstocc(arr,i+1 ,key);
               
      
    }
     public static void main(String args[]){
        int arr[]={1,2,4,3,5};
   
    System.out.println(firstocc(arr,0,5));
    }
    
}
