package matrix;
 import java.util.Arrays;

public class settozeromatrix {
   

    public static void setzero(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int colt[]= new int[m];
        int rowt[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    colt[i]=1;
                    rowt[j]=1;
                };

            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (colt[i]==1||rowt[j]==1) {
                    arr[i][j]=0;
                    
                }

            }
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,1,1,1},{1,0,1,1},{1,1,1,1},{2,4,6,7}};
      
     setzero(arr);
      System.out.println("the array after setting zero is:" + Arrays.deepToString(arr));

    }
    
}
    

