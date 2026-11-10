import java .util.*;
public class armstrongno{
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of digits of which you have to check:");
        int dig=sc.nextInt();
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        };
        temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit, count);
            temp=temp/10;

        };

        if(n==sum){
            System.out.print("the number :" + n );
            System.out.println("is an armstrong no");
        }else{
            System.out.println("the number :" + n  );
            System.out.println("is not an armstrong no");
        };
    };
}
    