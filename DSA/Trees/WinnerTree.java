import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

public class WinnerTree {

    public static void display(Node root,int depth)
    {
        if(root!=null)
            System.out.println(" ".repeat(depth)+root.data);

        if(root.left!=null)
            display(root.left, depth+1);
        if(root.right!=null)
            display(root.right, depth+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=6;i++)
            list.add(i);
        
        Queue<Node> queue = new LinkedList<>();
        for(int i=0;i<list.size();i++)
        {
            queue.offer(new Node(list.get(i)));
        }

        while(queue.size()>1)
        {
            int qz = queue.size();
            int len;
            if(qz%2==0)
                len=qz/2;
            else
                len=(qz-1)/2;

            for(int i=0;i<len;i++)
            {
                Node first = queue.poll();
                Node second = queue.poll();
                Node large;
                if(first.data>second.data)
                    large=new Node(first.data);
                else
                    large=new Node(second.data);
                large.left=first;
                large.right=second;
                queue.offer(large);
            }
            if(qz%2!=0)
            {
                Node curr=queue.poll();
                queue.offer(curr);
            }
            
        }
        Node root = queue.poll();
        display(root,0);
    }
}
