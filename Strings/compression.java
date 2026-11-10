package Strings;

public class compression {
    public static String compress(String str){
         
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
             int count=1;
          
                       while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            }  sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            };
              }
              // for returning lower length string
              return sb.length() < str.length() ? sb.toString() : str;
    }
    public static void main(String args[]){
        String str="aaaabbbcccddddddddddddddddeee";
        System.out.println(compress(str));
    }
    
    
}
