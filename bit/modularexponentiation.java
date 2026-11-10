package bit;
//
public class modularexponentiation {

    public static long modExp(long a, long b, long m){
        long result = 1;

        // Step 1: Reduce base first
        a = a % m;

        while(b > 0){

            // Step 2: If b is odd, multiply result with a
            if((b & 1) == 1){
                result = (result * a) % m;
            }

            // Step 3: Square the base
            a = (a * a) % m;

            // Step 4: Divide exponent by 2
            b = b >> 1;
        }

        return result;
    }

    public static void main(String[] args){
        long a = 3;
        long b = 13;
        long m = 100;

        System.out.println(modExp(a,b,m));
    }
}