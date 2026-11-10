package graphs;

public class noofislanddfs {

    public static int island(char ch[][]){
        if(ch==null || ch.length==0)return 0;
        int count=0;

        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch[0].length;j++){
                 
                if(ch[i][j]=='1'){
                    count++;
                    dfs(ch,i,j);
                }
            }
        }
        return count;
        

    }
    public static void dfs(char ch[][],int i,int j){

        if(i<0||i>=ch.length||j<0||j>=ch[0].length||ch[i][j]=='0'){
            return;
        }
        ch[i][j]='0';
        dfs(ch,i-1,j);
        dfs(ch,i+1,j);
        dfs(ch,i,j-1);
        dfs(ch,i,j+1);
        
    }
    public static void main(String args[]){
        char ch[][]={{'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
         System.out.println(island(ch));
    }
       
    }
    

