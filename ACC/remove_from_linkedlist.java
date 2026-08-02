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

    static Node removeElements(Node head, int val) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;

        while (curr.next != null) {

            if (curr.next.data == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements (-1 to stop)");

        while (true) {

            int x = sc.nextInt();

            if (x == -1)
                break;

            insertAtEnd(x);
        }

        System.out.println("Original Linked List");
        display(head);

        System.out.println("Enter value to remove");

        int val = sc.nextInt();

        head = removeElements(head, val);

        System.out.println("After Removing Elements");
        display(head);
    }
}
