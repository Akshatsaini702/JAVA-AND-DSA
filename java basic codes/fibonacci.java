import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");
        int n = sc.nextInt();

        int a = 0, b = 1;   // first two Fibonacci numbers

        System.out.print("Fibonacci Series: ");

        if (n >= 1) System.out.print(a + " ");  // print first term
        if (n >= 2) System.out.print(b + " ");  // print second term

        for (int i = 3; i <= n; i++) {
            int c = a + b;     // next term = sum of previous two
            System.out.print(c + " ");
            a = b;             // shift numbers
            b = c;
        }

        
    }
}

