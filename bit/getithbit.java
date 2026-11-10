package bit;
//

public class getithbit {
     public static void getith(int n,int i){
        int bitmask=1<<i;
        if((bitmask & n) ==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String args[]){
    getith(10,2);
    ;
    }
    
    
}
