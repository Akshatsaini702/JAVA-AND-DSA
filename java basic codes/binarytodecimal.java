public class binarytodecimal {
    public static int binToDec(int binNum){
        int mysum=binNum; // Store the original input
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + mysum+ " = " + decNum);
        return decNum;
    }
    public static void main(String args[]) {
        binToDec(101); // Example output: decimal of 101 = 5
    }
};
