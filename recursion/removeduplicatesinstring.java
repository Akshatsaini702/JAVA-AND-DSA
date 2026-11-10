package recursion;

public class removeduplicatesinstring {
    public static void removedup(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx== str.length()){
            System.out.println(newstr);
            return;
        }
      char ch= str.charAt(idx);
      if(map[ch-'a']==true){
        //fuplicate
        removedup(str, idx+1, newstr, map);

      }else{
        map[ch-'a']=true;
        removedup(str, idx+1, newstr.append(ch), map);
      }

    }
    public static void main(String args[])    {
        String str="appnnaacolleeeggeeee";
        removedup(str ,0,new StringBuilder(""),new boolean[26]);

    }
}
