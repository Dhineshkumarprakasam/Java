import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node head = null;

    static void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    static void display(Node head) {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static Node removeNthFromEnd(Node head, int n) {

        if (head == null)
            return null;

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = head;

        for (int i = 0; i < n; i++) {

            if (fast == null) {
                System.out.println("Invalid N Value");
                return head;
            }

            fast = fast.next;
        }

        while (fast != null) {

            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements (-1 to stop)");

        while (true) {

            int val = sc.nextInt();

            if (val == -1)
                break;

            insertAtEnd(val);
        }

        System.out.println("Original Linked List");
        display(head);

        System.out.println("Enter N");

        int n = sc.nextInt();

        head = removeNthFromEnd(head, n);

        System.out.println("After Removing Nth Node From End");
        display(head);
    }
}
