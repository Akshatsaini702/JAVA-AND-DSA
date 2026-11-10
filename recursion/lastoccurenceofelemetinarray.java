package recursion;

public class lastoccurenceofelemetinarray {
         public static int lastocc(int arr[],int i ,int key){
        if(i== arr.length){
            return -1;
        }
        int isfound =lastocc(arr,i+1,key); 
            if(isfound == -1 && arr[i]==key){
                 return i;
                 

            }
           
                                                                                          

        
        
        return isfound; 
               
      
    }
     public static void main(String args[]){
        int arr[]={1,2,4,3,5,5,66,7};
   
    System.out.println(lastocc(arr,0,5));
    }

    
}
