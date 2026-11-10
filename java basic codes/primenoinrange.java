import java.util.*;
public class primenoinrange {
    public static boolean primeno (int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
                
            }
        }
        return isprime;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(primeno(i)){
                System.out.print(i);
            }
        }
    }
    public static void main(String args[]){
        primeinrange(11);

    }

    
}

