import java.util.*;
public class palindrome{
    public static int palindrome(int n){
        int mynum=n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
         rev=(rev*10)+lastdigit;
         n=n/10;
        };

        if(rev==mynum){
            System.out.println("the number" + mynum + "is a palindrome");
        }else{
            System.out.println("the number" + mynum + "is not a palindrome");
        };

        return 0;
        

    }

    public static void main(String args[]){
        palindrome(12321);
    }
}