package Strings;
// 

public class anagrams {
    
    public static boolean compress(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int arr[]= new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;

        };
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

       
    }
    public static void main(String args[]){
        String str1="listena";
        String str2="stilean";

        System.out.println(compress(str1,str2));
    }
    

    
}
