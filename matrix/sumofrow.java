package matrix;

public class sumofrow {
  

    public static void printarr(int matrix[][]){
        int sum=0;
        
       
            for(int j=0;j<=matrix[0].length-1;j++){
                sum+=matrix[1][j];
                }
            
            System.out.println("the sum of all elements in the second row is " + sum);
        }
        
    
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,1,6},
                        {7,1,9}};
                        
                        printarr(matrix);}
    

    
}
