package matrix;

public class spiralmatrixdsa {
    public static void printspiral(int matrix[][]){
        int startrow=0,endrow=matrix.length-1,startcol=0,endcol=matrix[0].length-1;
        //top
       while(startrow<=endrow && startcol<=endcol){
         for(int i=startcol;i<=endcol;i++){
            System.out.println(matrix[startrow][i]);

        };
        //right
        for(int j=startrow+1;j<=endrow;j++){
            System.out.println(matrix[j][endcol]);
        };
        //bottom
        if(startrow<endrow){
             for(int i=endcol-1;i>=startcol;i--){
            
            
            System.out.println(matrix[endrow][i]);
        };
        };
       //left
        if(startcol<endcol){
            for(int j=endrow-1;j>=startrow+1;j--){
           
            System.out.println(matrix[j][startcol]);
        };
        };
        
        startrow++;
        endrow--;
        startcol++;
        endcol--;
        
       }
       System.out.println();

            };
            public static void main(String args[]){
                int matrix[][]= {{1,2,3,4},
                                {5,6,7,8},
                                {9,10,11,12},
                                {13,14,15,16}};
                                printspiral(matrix);
            }
        }
    
    

