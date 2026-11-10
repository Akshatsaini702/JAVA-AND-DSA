package matrix;

public class diagonalsumdsa {
  
    public static int diagonalsum(int matrix[][]){
          int sum=0;
        for(int i=0;i<matrix.length;i++){
             sum +=matrix[i][i];
             if(i!= matrix.length-i-1){
                sum+= matrix[i][matrix.length-i-1];
             }

        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println("the sum of the diagonals is " + diagonalsum(matrix));
    }
    

}
