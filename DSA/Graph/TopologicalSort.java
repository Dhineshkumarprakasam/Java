import java.util.*;
import java.io.*;

class graph
{
    HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();

    void add(int src, int dest)
    {
        if(!g.containsKey(src))
            g.put(src,new ArrayList<>());
        g.get(src).add(dest);
    }


    void toposort(int len)
    {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<Integer> indegree = new ArrayList<>();

        for(int i=0;i<len;i++)
            indegree.add(0);
        
        for(int i=0;i<len;i++)
        {
            if(g.containsKey(i))
                for(int j : g.get(i))
                {
                    indegree.set(j,indegree.get(j)+1);
                }
        }

        System.out.println("In degree : "+indegree);

        for(int i=0;i<len;i++)
        {
            if(indegree.get(i)==0)
                queue.add(i);
        }

        while(!queue.isEmpty())
        {
            int curr = queue.poll();
            order.add(curr);

            if(g.containsKey(curr))
            {
                for(int i : g.get(curr))
                {
                    indegree.set(i,indegree.get(i)-1);

                    if(indegree.get(i)==0)
                    {
                        queue.add(i);
                    }
                }
            }
        }

        System.out.println("Toposort order : "+order);

    }
}
    
public class BFS {
    public static void main(String[] args) {
        
        graph obj = new graph();
        obj.add(5, 0);
        obj.add(5, 2);
        obj.add(4, 0);
        obj.add(4, 1);
        obj.add(2, 3);
        obj.add(3, 1);

        obj.toposort(6);
    }
}
