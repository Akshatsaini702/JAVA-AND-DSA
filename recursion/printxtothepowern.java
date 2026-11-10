package recursion;

public class printxtothepowern {
    public static int optimisedpower(int x ,int n){
       if(n==0){
        return 1;
       }
        int halfpow=optimisedpower(x,n/2);
        int halfpowsq=halfpow*halfpow;
        //  n is odd 
       if(n%2 !=0){
            halfpowsq = x*halfpowsq;
        };
      
        
        return halfpowsq;
               
      
    }
     public static void main(String args[]){
    
   
    System.out.println(optimisedpower(2,5));
    }
    
}
