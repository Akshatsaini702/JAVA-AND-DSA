package Strings;
import java.util.*;

public class basicstring {
    public static void print(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        };
    }
    public static void main(String args[]){
        String str="hello world";
       
        print(str);
        

    }
    
}
