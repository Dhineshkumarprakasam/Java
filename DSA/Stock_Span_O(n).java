import java.util.*;

public class t5 {
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(100,80,60,70,60,75,85));
        int n=arr.size();
        
        //finding
        int span[] = new int[n];
        span[0]=1;

        Stack<Integer> stk = new Stack<>();
        stk.push(0);

        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && arr.get(i)>=arr.get(stk.peek()))
                stk.pop();

            span[i]= stk.isEmpty()? i+1:i-stk.peek();
            stk.push(i);
        }
        
        System.out.print("Ans : ");
        for(int i=0;i<n;i++)
            System.out.print(span[i]+" ");
            
    }
}
