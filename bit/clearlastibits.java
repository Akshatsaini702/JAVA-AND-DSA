package bit;

public class clearlastibits {
    public static void clearith(int n,int i){
        int bitmask=~(0)<<i;
        System.out.println(n&bitmask);
    }
    public static void main(String args[]){
    clearith(15,2);
    ;
    }
    
}
