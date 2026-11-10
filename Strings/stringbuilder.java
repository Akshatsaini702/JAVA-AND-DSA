package Strings;

public class stringbuilder {
    public static void main (String args[]){
StringBuilder sb=new StringBuilder();
    for(char ch='a';ch<'k';ch++){
        //append is used to add the character in the string builder
        sb.append(ch);
    }
    System.out.println(sb);
    }
    
}
