import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        data=val;
        left=null;
        right=null;
    }
}


class Tree
{
    Node root=null;
    void build(String data)
    {
        Queue<Node> queue = new LinkedList<>();
        String elements[] = data.split(" ");

        if(elements[0].equals("N"))
            return;
        
        if(root==null)
            root=new Node(Integer.parseInt(elements[0]));
        queue.offer(root);

        for(int i=1;i<elements.length;i++)
        {
            Node currNode = queue.poll();
            if(!elements[i].equals("N") && currNode.left==null)
            {
                currNode.left=new Node(Integer.parseInt(elements[i]));
                queue.offer(currNode.left);
            }
            i++;

            if(i>=elements.length)
                break;

            if(!elements[i].equals("N") && currNode.right==null)
            {
                currNode.right=new Node(Integer.parseInt(elements[i]));
                queue.offer(currNode.right);
            }
        }
    }

    void itDisplay(Node root, int depth)
    {
        if(root==null)
            return;
        System.out.println(" ".repeat(depth)+root.data);

        if(root.left!=null)
            itDisplay(root.left, depth+1);
        
        if(root.right!=null)
            itDisplay(root.right, depth+1);
    }

    void display()
    {
        itDisplay(root, 0);
    }

    ArrayList<Node> inorder(Node root, ArrayList<Node> arr)
    {
        if(root==null)
            return arr;
        
        if(root.left!=null)
            inorder(root.left,arr);

        arr.add(root);

        if(root.right!=null)
            inorder(root.right,arr);
        
        return arr;
    }

    //recover binary search tree
    void recoverBst()
    {
        ArrayList<Node> arr = inorder(root,new ArrayList<>());

        Node first=null;
        Node second=null;

        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i+1).data<arr.get(i).data)
            {
                if(first==null)
                    first=arr.get(i);
                second=arr.get(i+1);
            }
        }

        int temp=first.data;
        first.data=second.data;
        second.data=temp;
    }
}


public class RecoverBST
{
    public static void main(String[] args) {
        Tree obj = new Tree();
        obj.build("4 3 10 1 6 N 14 N N 8");

        System.out.println("Before : ");
        obj.display();

        obj.recoverBst();

        System.out.println("After : ");
        obj.display();
    }
}
