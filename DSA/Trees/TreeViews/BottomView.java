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
    void bottomView(Node root)
    {
        if(root==null)
            return;
        
        TreeMap<Integer,Integer> ans = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> hd = new LinkedList<>();

        queue.offer(root);
        hd.offer(0);

        while(!queue.isEmpty())
        {
            int qz=queue.size();
            for(int i=0;i<qz;i++)
            {
                Node curNode=queue.peek();
                int curhd = hd.peek();

                ans.put(curhd, curNode.data);
                if(curNode.left!=null)
                {
                    queue.offer(curNode.left);
                    hd.offer(curhd-1);
                }

                if(curNode.right!=null)
                {
                    queue.offer(curNode.right);
                    hd.offer(curhd+1);
                }

                queue.poll();
                hd.poll();
            }
        }

        System.out.print("Bottom view : ");
        for(Map.Entry<Integer,Integer> i : ans.entrySet())
        {
            System.out.print(i.getValue()+" ");
        }
        System.out.println();
    }
}


public class BottomView
{
    public static void main(String[] args) {
        tree obj = new tree();
        obj.build("1 2 3 4 5 6 N N N 7 8");
        Node root=obj.root;
        System.out.println("Tree Structure:-");
        obj.display(root, 0);
        System.out.println();

        view obj1=new view();
        obj1.bottomView(root);
    }
}
