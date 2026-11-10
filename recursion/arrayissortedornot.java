package recursion;


public class arrayissortedornot {
    public static boolean sortedornot(int arr[],int i){
        if (i==arr.length-1) {
            return true;
            
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedornot(arr,i+1);
               
      
    }
     public static void main(String args[]){
        int arr[]={1,2,4,3,5};
    System.out.println(sortedornot(arr,0));
    }
}
