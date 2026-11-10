package matrix;
import java.util.*;

public class rotatematribyninety {
    public static int[][] rotate(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        
        // Step 1: Transpose matrix banaya (Dimensions palat jayengi)
        int transpose[][] = new int[cols][rows]; 
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = a[i][j];
            }
        }
        
        // Step 2: Transpose matrix ki HAR ROW ko left-to-right reverse karo
        for (int i = 0; i < transpose.length; i++) {
            int left = 0;
            int right = transpose[0].length - 1;
            
            while (left < right) {
                // Row ke left aur right elements swap kar rahe hain
                int temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;
                
                left++;
                right--;
            }
        }
        
        // Naya rotated matrix wapas bhej do
        return transpose; 
    }
    
    public static void main(String args[]) {
        int a[][] = {
            {1, 3, 4, 5},
            {4, 5, 6, 8},
            {6, 4, 12, 4},
            {3, 4, 5, 7},
            {37, 6, 7, 7}
        };
        
        int[][] rotatedMatrix = rotate(a);
        
        // Output dekhne ke liye loop laga kar print karte hain
        for (int i = 0; i < rotatedMatrix.length; i++) {
            System.out.println(Arrays.toString(rotatedMatrix[i]));
        }
    }
}