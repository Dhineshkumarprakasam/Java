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
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node rotate(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;

        if (k == 0)
            return head;

        int move = length - k;

        Node curr = head;

        for (int i = 1; i < move; i++) {
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;
        temp.next = head;

        return newHead;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements (-1 to stop):");

        while (true) {
            int value = sc.nextInt();

            if (value == -1)
                break;

            insertAtEnd(value);
        }

        System.out.println("Original Linked List:");
        display(head);

        System.out.println("Enter K value:");
        int k = sc.nextInt();

        head = rotate(head, k);

        System.out.println("Linked List after Rotation:");
        display(head);
    }
}
