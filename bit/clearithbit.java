package bit;

public class clearithbit {
    public static void clearith(int n,int i){
        int bitmask=~(1<<i);
        System.out.println(n&bitmask);
    }
    public static void main(String args[]){
    clearith(10,1);
    ;
    }
    
    
}
