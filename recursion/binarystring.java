package recursion;

public class binarystring {

    public static void printBinaryString(int n, int lastPlaced, String str) {

        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always allowed to place 0
        printBinaryString(n - 1, 0, str + "0");

        // Place 1 only if last placed was 0
        if (lastPlaced == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        int n = 3;
        printBinaryString(n, 0, "");
    }
}