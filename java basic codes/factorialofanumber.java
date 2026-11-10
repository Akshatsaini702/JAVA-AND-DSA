import java.util.*;
class fatorialofanumber{
    public static void main(String []args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial of entered number is:" + fact);
    }

}
