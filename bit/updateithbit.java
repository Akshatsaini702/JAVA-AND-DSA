package bit;

public class updateithbit {
    public static void updateith(int n,int i, int newbit){
        int bitmask=newbit<<i;
        System.out.println(n|bitmask);
    }
    public static void main(String args[]){
    updateith(10,1,2);
    ;
    }
    
}
