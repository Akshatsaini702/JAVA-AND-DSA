package Strings;

public class stringpalindrome {

    public static void print(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("the string is not a palindrome");
                return;
            }
            
        }
        System.out.println("the string is a palindrome");
    }
    public static void main(String args[]){
        String str="madam";
        print(str);

    }
    
}
