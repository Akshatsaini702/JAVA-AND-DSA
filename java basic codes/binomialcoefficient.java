import java.util.*;

public class binomialcoefficient {
    public static int swap(int n){
   int fact=1;
        
        for(int i=1;i<=n;i++){
  fact=fact*i;
    }
    return fact;
    }
    public static int main(int n,int r){
       int  n_fact=swap(n);
       int r_fact=swap(r);
         int n_r_fact=swap(n-r);
         return n_fact/(r_fact*n_r_fact);

    }
    public static void main(String args[]){
        
        System.out.println(main(6, 3)
         );
        
       
       
}}