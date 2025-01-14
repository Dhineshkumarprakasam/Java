import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int value)
    {
        data=value;
        next=null;
    }
}

class ll
{
    Node head=null;
    Node tail=null;
    void add(int value)
    {
        if(head==null)
        {
            head=new Node(value);
            tail=head;
        }

        else
        {
            tail.next=new Node(value);
            tail=tail.next;
        }
    }
}

public class loop
{
    public static boolean detectLoop(Node head)
        {
            Node slow=head,fast=head;
            while(slow!=null && fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast)
                    return true;
            }
            return false;
        }

    public static void main(String args[])
    {
        ll list = new ll();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.head.next.next.next.next=list.head;
        System.out.println(detectLoop(list.head));

        
    }
}
