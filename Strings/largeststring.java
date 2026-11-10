package Strings;
//lexicographically largest string
//compareTo() method is used to compare two strings lexicographically. It returns a positive integer if the first string is greater than the second string, a negative integer if the first string is less than the second string, and zero if the two strings are equal.

public class largeststring {
    public static void main(String args[]){
        String str[]={"apple","mango","banana"};
        String largest=str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
    
}
