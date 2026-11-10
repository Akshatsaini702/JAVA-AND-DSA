package bit;

public @interface togglebitaftermsb {

public class ToggleBits {
    public static int toggleRightOfMSB(int n) {
        // Edge case: if n is 0, nothing to toggle
        if (n == 0) return 0; 
        
        int temp = n;
        int msbPosition = 0;
        
        // Step 1: Find 0-indexed position of MSB
        while (temp > 1) {
            msbPosition++;
            temp >>= 1;
        }
        
        // Step 2: Create a mask of 1s of length 'msbPosition'
        // For n=10 (1010), msbPosition is 3. 
        // 1 << 3 = 8 (1000). 8 - 1 = 7 (0111).
        int mask = (1 << msbPosition) - 1;
        
        // Step 3: XOR with mask to toggle bits
        return n ^ mask;
    }

    public static void main(String[] args) {
        System.out.println(toggleRightOfMSB(10)); // Output: 13
    }
}
}
