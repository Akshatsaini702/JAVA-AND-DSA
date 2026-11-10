package bit;
//

public class nopowerof2nornot {
    public static boolean powof2ornot(int n){
        
     return (n&(n-1))==0;
    };
    public static void main(String args[]){
   System.out.println( powof2ornot(10));
    ;
    }
    
}
 