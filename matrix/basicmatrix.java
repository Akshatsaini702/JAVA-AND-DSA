package matrix;
import java.util.Scanner;

public class basicmatrix {

    public static void printarr(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        int maxrow =-1;
        int maxcol=-1;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<smallest)
                    {smallest=matrix[i][j];
                        maxrow=i;
                        maxcol=j;
                    }
                  
                }
             }
            System.out.println("the smallest number is " + smallest + "found at index (" + maxrow+ "," + maxcol + ")");
        }
      
    

    public static void main(String args[]){
  
        int matrix[][]= new int[3][3];

        Scanner sc= new Scanner(System.in);
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        printarr(matrix);
    }
}