import java.util.*;

class Node{
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

//build tree
class tree
{
    Node root;
    void build(String elements)
    {
        root=null;
        String arr[]=elements.split(" ");
        if(arr[0].equals("N"))
            return;

        root=new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int index=1;
        while(!queue.isEmpty() && index<arr.length)
        {
            Node currNode=queue.peek();
            queue.poll();
            if(!arr[index].equals("N"))
            {
                currNode.left=new Node(Integer.parseInt(arr[index]));
                queue.offer(currNode.left);
            }
            index++;

            if(index>=arr.length)
                break;

            if(!arr[index].equals("N"))
            {
                currNode.right=new Node(Integer.parseInt(arr[index]));
                queue.offer(currNode.right);
            }
            index++;
        }

    }

    void display(Node root, int depth)
    {
        if(root==null)
            return;
        System.out.println(" ".repeat(depth)+root.data);
        display(root.left,depth+1);
        display(root.right, depth+1);
    }
}


class view
{
    void leftView(Node root)
    {
        if(root==null)
            return;
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int qz=queue.size();
            for(int i=0;i<qz;i++)
            {
                Node currNode=queue.peek();
                if(i==0)
                    ans.add(queue.peek().data);

                if(currNode.left!=null)
                    queue.offer(currNode.left);
                if(currNode.right!=null)
                    queue.offer(currNode.right);

                queue.poll();
            }
        }
        System.out.print("Left view : ");
        for(int i:ans)
            System.out.print(i+" ");
        System.out.println();
    }
}


public class LeftView
{
    public static void main(String[] args) {
        tree obj = new tree();
        obj.build("1 2 3 4 5 6 N N N 7 8");
        Node root=obj.root;
        System.out.println("Tree Structure:-");
        obj.display(root, 0);
        System.out.println();

        view obj1=new view();
        obj1.leftView(root);
    }
}
