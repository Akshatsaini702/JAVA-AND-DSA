package bit;
//   

public class setithbit {
    public static void setith(int n,int i){
        int bitmask=1<<i;
        System.out.println(n|bitmask);
    }
    public static void main(String args[]){
    setith(10,2);
    ;
    }
    
     
}
