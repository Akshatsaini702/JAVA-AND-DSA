package recursion;

public class sumoffirstnaturalno {
    
     public static int sum(int n){
        if(n==1){
           
            return 1;
        }
        int sumnm1=sum(n-1);
        int sumn=n+sumnm1;
        return sumn;
        
       
    }
        
        

    
    
    public static void main(String args[]){
        int n=10;
   System.out.println(sum(n));
    }
    
}
