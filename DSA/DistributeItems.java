import java.util.HashMap;
import java.util.Map;

//distribution items to a person when he cannot have more that 2 items of same type
//k -> no of people
public class DistributeItems {
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,1};
        int k=2;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr)
            map.put(i,map.getOrDefault(i, 0)+1);
        
        boolean possible=true;
        for(Map.Entry<Integer,Integer> i :  map.entrySet())
        {
            if(i.getValue()>(2*k))
            {
                possible=false;
                break;
            }
        }

        System.out.println(possible?"It is possible" : "It is not possible");
    }
}
