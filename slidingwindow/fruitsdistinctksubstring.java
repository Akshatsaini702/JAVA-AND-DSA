package slidingwindow;
import java.util.*;

public class fruitsdistinctksubstring {
    public static int fruits(String str,int k){
        if(str==null||str.length()==0||k==0) return -1;

        int left=0,maxlength=0;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int right=0;right<str.length();right++){
            char chright=str.charAt(right);

            m.put(chright,m.getOrDefault(chright,0)+1);

            while(m.size()>k){
                char chleft=str.charAt(left);
                 
                m.put(chleft,m.get(chleft)-1);
                if(m.get(chleft)==0){
                    m.remove(chleft);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);

        }
        return maxlength;

    }
    public static void main(String args[]){
        String str="kwkeweeek";
       System.out.println(fruits(str,4));


    }
    
}
