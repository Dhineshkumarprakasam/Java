import java.util.*;

class Node
{
    int dest;
    int weight;

    Node(int dest, int weight)
    {
        this.dest=dest;
        this.weight=weight;
    }
}


class Build
{
    HashMap<Integer,ArrayList<Node>> graph = new HashMap<>();

    int shortestPathWeight = Integer.MAX_VALUE;
    List<Integer> shortestPath;

    void add(int src, int dest, int weight)
    {
        if(!graph.containsKey(src))
            graph.put(src,new ArrayList<>());
        graph.get(src).add(new Node(dest,weight));
    }

    void display()
    {
        for(Map.Entry<Integer, ArrayList<Node>> i : graph.entrySet())
        {
            System.out.print(i.getKey()+" -> ");
            for(Node j : i.getValue())
                System.out.print("("+j.dest+","+j.weight+")");
            System.out.println();
        }
    }

    void paths(int src, int dest, List<Integer> path, int currentWeight)
    {
        path.add(src);

        if(src==dest)
        {
            System.out.println(path+"->"+currentWeight);
            if(currentWeight<shortestPathWeight)
            {
                shortestPathWeight=currentWeight;
                shortestPath=new ArrayList<>(path);
            }
        }
        else if(graph.containsKey(src))
        {
            for(Node i : graph.get(src))
            {
                if(!path.contains(i.dest))
                {
                    paths(i.dest,dest,path,currentWeight+i.weight);
                }
            }
        }
        path.remove(path.size() - 1);
    }
}

public class ShortestPath
{
    public static void main(String[] args) {
        Build obj = new Build();
        obj.add(0,1,1);
        obj.add(0,2,2);
        obj.add(1,2,4);
        obj.add(1,3,1);
        obj.add(3,4,5);
        obj.add(4,2,6);
        obj.display();

        obj.paths(0,4,new ArrayList<>(),0);

        System.out.println("Shortest path : "+obj.shortestPath);
        System.out.println("Shortest weight cost : "+obj.shortestPathWeight);
    }
}
