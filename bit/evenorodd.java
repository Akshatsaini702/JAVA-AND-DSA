package bit;

public class evenorodd {  
    public static void oddoreven(int n){
        int bitmask=1;
        if((bitmask & n) ==0){
            System.out.println("the no is even");
        }else{
            System.out.println("the no is odd");
        }
    }
    public static void main(String args[]){
     oddoreven(10);
     oddoreven(17);
    }
    
    
}
