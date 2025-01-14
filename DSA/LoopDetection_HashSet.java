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

public class LoopDetection_HashSet
{
    public static boolean detectLoop(Node head)
        {
            HashSet<Node> a = new HashSet<>();
            Node temp=head;
            while(temp!=null)
            {
                if(a.contains(temp))
                    return true;
                a.add(temp);
                temp=temp.next;
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
