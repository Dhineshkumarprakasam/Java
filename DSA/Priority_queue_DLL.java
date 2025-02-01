import java.util.*;

class ll
{
    int val;
    int pr;
    ll next;
    ll prev;

    ll(int val,int pr)
    {
        this.val=val;
        this.pr=pr;
        next=null;
        prev=null;
    }
}

public class p7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        ll head=null;
        ll tail=null;
        ll temp=null;

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter pr : ");
            int pr = sc.nextInt();
            
            System.out.print("Enter val : ");
            int val=sc.nextInt();

            System.out.println();

            ll newnode = new ll(val,pr);

            if(head==null)
            {
                head=newnode;
                tail=head;
            }
            else
            {
                newnode.prev=tail;
                tail.next=newnode;
                tail=tail.next;
            }
        }

        //displaying created pq
        temp=head;
        while(temp!=null)
        {
            System.out.print("( val: "+temp.val+", pr :"+temp.pr+" ) ");
            temp=temp.next;
        }

        System.out.println("\n");
        
        temp=tail;
        while(temp!=null)
        {
            System.out.print("( val: "+temp.val+", pr :"+temp.pr+" ) ");
            temp=temp.prev;
        }

        //selection sort
        for(ll i=head;i!=null;i=i.next)
        {
            ll min=i;
            for(ll j=i.next;j!=null;j=j.next)
            {
                if(j.pr<min.pr)
                    min=j;
            }

            if(min!=i)
            {
                int pr1=min.pr;
                int val1=min.val;
                min.pr=i.pr;
                min.val=i.val;

                i.pr=pr1;
                i.val=val1;
            }
        }

        //sorted
        System.out.println("\nsorted:\n");
        temp=head;
        while(temp!=null)
        {
            System.out.print("( val: "+temp.val+", pr :"+temp.pr+" ) ");
            temp=temp.next;
        }       
    }
}
