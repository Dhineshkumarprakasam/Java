import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

class ll
{
    Node head=null;
    Node tail=null;

    void add(int val)
    {
        if(head==null)
        {
            head=new Node(val);
            tail=head;
        }
        else
        {
            tail.next=new Node(val);
            tail=tail.next;
        }
    }
}


public class loop1
{
    public static void main(String args[])
    {
        ll list = new ll();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //segregating
        Node oddPointer=null,evenPointer=null;
        Node odd=null,even=null;
        Node temp=list.head;
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                if(odd==null)
                {
                    odd=new Node(temp.data);
                    oddPointer=odd;
                }
                else
                {
                    oddPointer.next=new Node(temp.data);
                    oddPointer=oddPointer.next;
                }
            }

            else
            {
                if(even==null)
                {
                    even=new Node(temp.data);
                    evenPointer=even;
                }
                else
                {
                    evenPointer.next=new Node(temp.data);
                    evenPointer=evenPointer.next;
                }
            }

            temp=temp.next;
        }

        evenPointer.next=odd;

        temp=even;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
}
