public class optimisedxpown {

    public static int powxn(int x, int n){
        if(n==0) return 1;

        int halfpower =powxn(x,n/2);

        if(n%2==0){
            return halfpower*halfpower;
        } else{return halfpower*halfpower*x;}

    }
    public static void main(String args[]){
       System.out.println(powxn(2,5));

    }
    
}
