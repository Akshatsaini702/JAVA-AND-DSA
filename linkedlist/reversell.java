package linkedlist;
class Node {
    int data;
    Node next; // Agle dibbe ka address (Parchi)

    Node(int data) {
        this.data = data;
        this.next = null;
    }}

public class reversell {
    public static Node reverseList(Node head) {
        Node curr = head; // Tu abhi pehle dibbe par khada hai
        Node prev = null; // Peeche abhi koi nahi hai
        Node next = null; // Agle dibbe ka address safe rakhne ke liye khali parchi

        // Jab tak train khatam nahi hoti (curr null nahi hota)
        while (curr != null) {
            // Step 1: Agle dibbe ka address safe kar lo, warna aage ki train kho jayegi
            next = curr.next; 

            // Step 2: Palti Maar! Apni parchi par aage wale ki jagah, peeche wale (prev) ka naam likh do
            curr.next = prev; 

            // Step 3: Peeche wale (prev) ko aage badha kar wahan le aao jahan tu abhi hai
            prev = curr; 

            // Step 4: Tu khud agle dibbe par chala ja, jiska address Step 1 mein safe kiya tha
            curr = next; 
        }
        
        // Loop khatam hone par 'prev' aakhiri dibbe par khada hoga, jo ab naya Head ban gaya hai
        return prev; 
    }

    // Train ko print karne ka chota sa helper function
     public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Ek train banate hain: 10 -> 20 -> 30 -> 40 -> NULL
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Train:");
        printList(head);

        // Train ko reverse karo
        head = reverseList(head);

        System.out.println("Reversed Train:");
        printList(head);
    }
    
}
