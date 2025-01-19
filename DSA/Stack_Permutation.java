import java.util.*;

public class Stack_Permutation
{
    public static void main(String[] args) {
        
        int orginal[] = {1,2,3};
        int target[] = {2,1,3};

        Stack<Integer> stk = new Stack<>();

        int j=0;

        for(int i=0;i<orginal.length;i++)
        {
            stk.push(orginal[i]);

            while(!stk.isEmpty() && stk.peek()==target[j] )
            {
                stk.pop();
                j++;
            }
        }

        if(stk.isEmpty())
            System.out.println("It is a stack permutation");
        else
            System.out.println("It is not stack permutation");

    }
}
