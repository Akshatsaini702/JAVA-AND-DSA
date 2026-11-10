package Strings;

public class substring {
    public static void print(String str,int si,int ei){
        for(int i=si;i<ei;i++){
            System.out.print(str.charAt(i));
        };
    }
    public static void main(String args[]){
        String str="helloworld";
      System.out.println(str.substring(0,6)); 
        int si=0;
        int ei=5;
        print(str,si,ei); 
      
        

    }
    
}
