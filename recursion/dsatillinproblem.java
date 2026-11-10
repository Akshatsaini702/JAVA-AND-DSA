package recursion;

public class dsatillinproblem {
    public static int tiling(int n){ //2*n(floor size)
        //bae case
        if(n==0 || n==1){
            return 1;
        }

        
        //verticalchoice
        int fnm1= tiling(n-1);
        //horizontal case
        int fnm2= tiling(n-2);
        int totalways=fnm1+fnm2;
        return totalways;

    }

    

    public static void main(String args[]){
        System.out.println(tiling(4));


    }
}
