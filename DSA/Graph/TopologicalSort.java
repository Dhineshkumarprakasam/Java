import java.util.*;

class graph
{
    HashMap<Character,ArrayList<Character>> g = new HashMap<>();

    void add(char src, char dest)
    {
        g.putIfAbsent(src, new ArrayList<>());
        g.putIfAbsent(dest, new ArrayList<>());
        g.get(src).add(dest);
    }


    void top()
    {
        Queue<Character> queue = new LinkedList<>();
        HashMap<Character,Integer> indegree = new HashMap<>();
        ArrayList<Character> order = new ArrayList<>();

        for(char i : g.keySet())
            indegree.put(i,0);
        
        for(char i : g.keySet())
            for(char j : g.get(i))
                indegree.put(j,indegree.get(j)+1);

        
        for(Map.Entry<Character,Integer> i : indegree.entrySet())
            if(i.getValue()==0)
                queue.offer(i.getKey());


        while(!queue.isEmpty())
        {
            char curr = queue.poll();
            order.add(curr);

            for(char i : g.get(curr))
            {
                indegree.put(i,indegree.get(i)-1);
                if(indegree.get(i)==0)
                    queue.offer(i);
            }
        }

        System.out.println("Sorted : "+order);
    }
}

public class t5 {
    public static void main(String[] args) {
        
        graph obj = new graph();
        obj.add('A','B');
        obj.add('A','C');
        obj.add('B','D');
        obj.add('C','D');

        obj.top();
    }
}
