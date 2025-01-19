import java.util.*;

public class Celebrity_Problem
{
    public static int find()
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no of people : ");
        n = sc.nextInt();

        int arr[][] = new int[n][n];

        //getting input
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter for "+i+","+j+" : ");
                arr[i][j]=sc.nextInt();
            }  
        }

        //finding
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<arr.length;i++)
            stk.push(i);
        
        while(stk.size()>1)
        {
            int col=stk.pop();
            int row=stk.pop();

            if(arr[row][col]==1)
                stk.push(col);
            else
                stk.push(row);
        }
        
        //only one element is present in stack
        int x=stk.pop();

        for(int i=0;i<arr.length;i++)
        {
            if(i==x)
                continue;
            if(arr[x][i]==1)
                return -1;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i==x)
                continue;
            if(arr[i][x]==0)
                return -1;
        }

        return x;

    }

    public static void main(String args[])
    {
        int ans = find();
        if(ans==-1)
            System.out.println("Celebrity not found");
        
        else
            System.out.println("Celebrity is : "+ans);
    }
}
