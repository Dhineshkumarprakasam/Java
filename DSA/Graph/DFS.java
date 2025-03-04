import java.util.*;
import java.io.*;

class graph
{
    HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();
    void add(int vertex,int to)
    {
        if(!g.containsKey(vertex))
            g.put(vertex,new ArrayList<>());
        g.get(vertex).add(to);
    }

    void display()
    {
        for(Map.Entry<Integer,ArrayList<Integer>> i : g.entrySet())
            System.out.println(i.getKey()+" -> "+i.getValue());
    }

    void dfs(int src, HashSet<Integer> visited)
    {
        System.out.print(src+" ");
        visited.add(src);

        if(g.containsKey(src))
        {
            for(int i : g.get(src))
                if(!visited.contains(i))
                    dfs(i,visited);
        }
    }
}

public class t3
{
    public static void main(String[] args) {
        graph obj = new graph();
        obj.add(0,1);
        obj.add(0,2);
        obj.add(1,2);
        obj.add(1,3);
        obj.add(3,4);
        obj.add(4,2);

        obj.display();

        obj.dfs(1,new HashSet<>());
    }
}
