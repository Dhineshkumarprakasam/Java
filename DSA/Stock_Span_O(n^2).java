import java.util.*;

public class Stock_Span {
    public static void main(String args[])
    {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(100,80,60,70,60,75,85));
        int n=arr.size();
        
        //finding
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int val=1;
            for(int j=i-1;j>0;j--)
            {
                if(arr.get(j)<=arr.get(i))
                    val++;
                else
                    break;
            }

            ans.add(val);
        }

        System.out.println("Ans : "+ans.toString());
            


    }
}
