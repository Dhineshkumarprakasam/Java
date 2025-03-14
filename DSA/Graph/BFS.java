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

    void bfs(int src)
    {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.offer(src);
        visited.add(src);

        while(!queue.isEmpty())
        {
            int curr = queue.poll();
            if(g.containsKey(curr))
            {
                for(int i : g.get(curr))
                {
                    if(!visited.contains(i))
                    {
                        queue.offer(i);
                        visited.add(i);
                    }
                }
            }
        }

        for(int i : visited)
            System.out.print(i+" ");
    }
}
public class BFS {
    public static void main(String[] args) {
        
        graph obj = new graph();
        obj.add(0,1);
        obj.add(0,2);
        obj.add(1,3);
        obj.add(1,4);
        obj.add(2,5);

        obj.bfs(0);
    }
}
