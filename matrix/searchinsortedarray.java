package matrix;
//search in sorted array
//the array is sorted in row wise and column wise manner
// Staircase search in row-wise and column-wise sorted matrix
// Time complexity = O(n + m)

public class searchinsortedarray {
    public static boolean stair(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length &&  col>=0){
            if(key==matrix[row][col]){
                System.out.println("the key is found at index (" + row + "," + col + ")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }
            else{
                    row++;
                }
            }
                  System.out.println("the key is not found in the matrix");
return false;
        }
  
    
    public static void main(String args[])
{
    int matrix[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
            int key =33;
            stair(matrix, key);
}    }

