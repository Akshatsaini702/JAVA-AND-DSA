package slidingwindow;
import java.util.*;

public class longestsubstringwithoutrep {
    public static int sub(String str){
        int left=0,maxlength=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for( int right=0;right<str.length();right++){
            char ch=str.charAt(right);

            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }

            map.put(ch, right);

            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
              
    }
    public static void main(String args[]){
        String str="pwwkew";
        System.out.println(sub(str));

    }
}
