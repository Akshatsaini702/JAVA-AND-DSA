package matrix;

public class transposeofmatrix {

    public static void print(int a[][]){
        int transpose[][]= new int[a[0].length][a.length];
       
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                transpose[j][i]=a[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
    for(int j=0;j<transpose[0].length;j++){
        System.out.print(transpose[i][j] + " ");
    }
    System.out.println();
}
        
    }
    public static void main(String args[]){
        int a[][]={{1,3,4,5},
    {4,5,6,8},
{6,4,12,4},
{3,4,5,7},
{37,6,7,7}};
print(a);
    }
    
}
