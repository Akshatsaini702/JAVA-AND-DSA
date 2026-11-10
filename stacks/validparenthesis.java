package stacks;
import java.util.*;

public class validparenthesis {

    public static boolean validpa(String str){
        Stack <Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }     else{if(st.isEmpty()){
                return false;

            }
                 

            char top=st.peek();

            //st.peek();

            if((ch=='}' && top=='{')||(ch==']' && top=='[')||(ch==')' && top=='(')){
                st.pop();
                
                
            }else{return false;}}
         }
         return st.isEmpty();

    }
    public static void main(String args[]){
        String str1="{[()]}";
        String str2="{}[(";

        System.out.println("test 1:" + validpa(str1));
         System.out.println("test 2:" + validpa(str2));
    }
    
}
