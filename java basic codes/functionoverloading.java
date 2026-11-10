import java.util.*;
public class functionoverloading {
    public static int addition(int a, int b){
        return a+b;
    };
    public static float addition(float a, float b){
        return a+b;
    };
    
    
    public static void main(String args[]){
        System.out.println("the addition of following numbers:" + addition(8.98f,9.97f));

    }

    
}
