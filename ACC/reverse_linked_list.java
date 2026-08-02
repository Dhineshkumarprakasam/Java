import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
    static Node head=null;
    static void insertAtend(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node temp = head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
    }
    static void display(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
             System.out.print(temp.data+"->");
             temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return  prev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements(-1 to stop)");
        while (true)
        {
            int val = sc.nextInt();
            if(val==-1)
            {
                break;
            }
            insertAtend(val);
        }
        System.out.println("The linked list elements are:");
        display(head);
        System.out.println("After reverse the LL:");
        head=reverse(head);
        display(head);
    }
}
