import java.util.*;
public class avgofnum {
    public static int average(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers of integers whom you want to find out the average:");  
        n=sc.nextInt();

        
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("enter the integer:");
        int integer=sc.nextInt();
            sum+=integer;
        }
        int avg=sum/n;
        System.out.println("the average of " + n  +"integers is:" + avg );

     return avg;


        
    }
    public static void main(String[] args) {
        average(5
        );
        
    }
    
}
