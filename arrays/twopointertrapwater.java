package arrays;

public class twopointertrapwater {

    public static int twopoint(int arr[]) {
        int left = 0;
        int right = arr.length - 1; // Semicolon fixed
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        // Condition fixed: Jab tak index cross nahi hote
        while (left < right) {
            
            // MAIN LOGIC MISSING THA: Pehle bottleneck check karo
            if (arr[left] <= arr[right]) {
                
                // Ab tum left side mein ho
                if (arr[left] >= leftmax) {
                    leftmax = arr[left];
                } else {
                    water += leftmax - arr[left];
                }
                left++; // left update ko 'if-else' ke bahar rakho, taaki har case mein pointer aage badhe
                
            } else { // arr[right] chhota hai
                
                // Ab tum right side mein ho
                if (arr[right] >= rightmax) {
                    rightmax = arr[right];
                } else {
                    water += rightmax - arr[right];
                }
                right--; // right update ko bhi 'if-else' ke bahar rakho
            }
        }
        return water;
    }
    
    public static void main(String args[]) {
        int arr[] = {4, 1, 6, 8, 3, 5, 9, 4, 6};
        System.out.println(twopoint(arr));
    }
}