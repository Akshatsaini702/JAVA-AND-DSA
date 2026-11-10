package recursion;

public class friendspair {
    public static int friendpair(int n){
        if(n==1 || n==2){
            return n;
        }
        //single paring 
        int fnm1=friendpair(n-1);
        //pair choice
        int fnm2=friendpair(n-2);
        int pairways=(n-1) * fnm2;

        //total ways
        int totalways=pairways+fnm1;
        return totalways;
    }
    public static void main(String args[]){
    System.out.println(  friendpair(3));

    }

    
}
