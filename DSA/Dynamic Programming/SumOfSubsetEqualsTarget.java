import java.util.*;

public class SumOfSubsetEqualsTarget
{
    public static void main(String[] args) {
        
        //subset sum
        int arr[] = {1,2,3,4,5,6,7,12,20};
        int target = 15;
        int n = arr.length;

        boolean dp[][] = new boolean[n+1][target+1];

        for(int i=0;i<=n;i++)
            dp[i][0]=true;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=target;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]= dp[i][j-1] || dp[i][j-arr[i-1]];
                }
                else
                    dp[i][j]=dp[i][j-1];
            }
        }

        System.out.println(dp[n][target]);


        //retrive
        if(dp[n][target])
        {
            ArrayList<Integer> ans = new ArrayList<>();
            
            int i=n;
            int j=target;

            while(i>0 && j>0)
            {
                if(j>=arr[i-1] && dp[i-1][j-arr[i-1]])
                {
                    ans.add(arr[i-1]);
                    j-=arr[i-1];
                }
                i--;
            }

            System.out.println(ans);
        }

    }
}
