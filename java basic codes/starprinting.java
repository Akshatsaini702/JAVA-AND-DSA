import java.util.Scanner;

public class starprinting {
    
    public static void main(String []args){
            Scanner sexy=new Scanner(System.in);
    int n=sexy.nextInt();
    char ch='A';
   

    for(int line=1;line<=n;line++){
        for(int num=1;num<=line;num++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}
