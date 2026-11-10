import java .util.*;
public class primenumusingfunt{
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
         for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                 return false;
            } 
        }
        
        return true;
    };
    public static int primeinrange (int n){
        for(int i=2;i<=n;i++){
           if(isprime(i)) {
            System.out.print(i);
           };
           System.out.println();
        };
return n;
    }

    public static void main(String args[]){
        primeinrange(5);

    }

}
