import java.util.*;
import java.io.*;

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

class tree
{
    Node build(String data)
    {
        Node root=null;
        String elements[] = data.split(" ");
        
        if(elements[0].equals("N"))
            return null;
        
        if(root==null)
            root=new Node(Integer.parseInt(elements[0]));

        Queue<Node> queue = new LinkedList<>();
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
        
        return root;
    }

    
    ArrayList<Integer> traverse(Node root)
    {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> leaf = new ArrayList<>();
        ArrayList<Integer> bound = new ArrayList<>();
        Queue<Node> queue= new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int qz = queue.size();
            for(int i=0;i<qz;i++)
            {
                Node currNode=queue.poll();
                if(i==0)
                    left.add(currNode.data);
                if(i==qz-1)
                    right.add(currNode.data);
                if(currNode.left==null && currNode.right==null)
                    leaf.add(currNode.data);
                if(currNode.left!=null)
                    queue.offer(currNode.left);
                if(currNode.right!=null)
                    queue.offer(currNode.right);
            }
        }

        for(int i : left)
            if(!bound.contains(i))
                bound.add(i);
        
        for(int i : leaf)
            if(!bound.contains(i))
                bound.add(i);
                
        for(int i : right)
            if(!bound.contains(i))
                bound.add(i);
        
        return bound;
    }
}

public class BoundaryTraversal
{
    public static void main(String args[])
    {
        tree obj = new tree();
        Node root = obj.build("1 2 3 4 5 6 7");
        ArrayList<Integer> ans = obj.traverse(root);

        System.out.print("Boundry value traversal : ");
        for(int i : ans)
            System.out.print(i+" ");
    }
}
