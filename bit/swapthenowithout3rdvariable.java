package bit;


public class swapthenowithout3rdvariable {
    public static void main(String args[]){
        int a=74;
        int b=76;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    
}
