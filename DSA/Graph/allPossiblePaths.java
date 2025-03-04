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

    void printpath(int src, int dest, List<Integer> path)
    {
        path.add(src);
        if(src==dest)
            System.out.println(path);
        else if(g.containsKey(src))
        {
            for(int i : g.get(src))
                printpath(i, dest, path);
        }

        path.remove(path.size()-1);
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

        obj.printpath(0,2,new ArrayList<>());
    }
}
